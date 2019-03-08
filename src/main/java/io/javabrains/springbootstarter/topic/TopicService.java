/*

package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    private List<Course> topics= new ArrayList<>(Arrays.asList(
            new Course("spring","spring framework","spring description"),
            new Course("java","java framework","java description"),
            new Course("c++","c++ framework","c++ description")
    ));

    public List<Course> getAllTopics(){
        return topics;
    }

    public Course getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Course topic) {
        topics.add(topic);
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }

    public void updateTopic(String id, Course topic) {
        System.out.println("coming here------------------");
        for(int i=0;i<topics.size();i++){
            Course t=topics.get(i);
            if(t.getId().equals(id))
                topics.set(i,topic);

        }
    }
}



*/

//--------------22222222222222222222222222222


package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics(){

       // return topics;


        List<Topic> topics =new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;

    }


    public Topic getTopic(Integer id){
     //   return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

       return topicRepository.findById(id).get();
    }


    public void addTopic(Topic topic) {
        //topics.add(topic);

        topicRepository.save(topic);
    }

    public void deleteTopic(Integer id) {


        //topics.removeIf(t->t.getId().equals(id));

    topicRepository.deleteById(id);
    }

    public void updateTopic(Integer id, Topic topic) {
        System.out.println("coming here------------------");
     /*   for(int i=0;i<topics.size();i++){
            Course t=topics.get(i);
            if(t.getId().equals(id))
                topics.set(i,topic);

        }*/

     topicRepository.save(topic);


    }

    public List<Topic> getAllTopicBetweenId(Integer id1, Integer id2) {

        List<Topic> topics =new ArrayList<>();
        topicRepository.findByIdBetween(id1,id2).forEach(topics::add);
        return topics;


    }
}



