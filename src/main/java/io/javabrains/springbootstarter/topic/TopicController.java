/*
package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

   */
/* @RequestMapping("/topic")
    public String getAllTopic(){
        return "ALL topic";
    }
*//*



    @RequestMapping("/topics")
    public List<Course> getAllTopic(){
        return Arrays.asList(
                new Course("spring","spring framework","spring description"),
                new Course("java","java framework","java description"),
                new Course("c++","c++ framework","c++ description")
        );
    }



}
*/


// ------------2222222222222-------------------------------------------------

/*

package io.javabrains.springbootstarter.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {


    @Autowired
    private CourseService topicService;

    @RequestMapping("/topics")
    public List<Course> getAllTopic(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Course getTopicById(@PathVariable String id){
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Course topic){
        topicService.addTopic(topic);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopicById(@PathVariable String id){
        topicService.deleteTopic(id);
    }


    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopicById(@RequestBody Course topic,@PathVariable String id){
        topicService.updateTopic(id,topic);
    }


}
*/

////------------3333333333333333--------------------------------

package io.javabrains.springbootstarter.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class  TopicController {


    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable Integer id){
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopicById(@PathVariable Integer id){
        topicService.deleteTopic(id);
    }


    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopicById(@RequestBody Topic topic,@PathVariable Integer id){
        topicService.updateTopic(id,topic);
    }

    @RequestMapping("/topics/{id1}/{id2}")
    public List<Topic> getAllTopicBetween(@PathVariable Integer id1,@PathVariable Integer id2){
        return topicService.getAllTopicBetweenId(id1,id2);
    }

}






