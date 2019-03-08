package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic,Integer>{

    List<Topic> findByIdBetween(Integer id1, Integer id2);


}
