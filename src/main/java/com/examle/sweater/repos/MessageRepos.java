package com.examle.sweater.repos;

import com.examle.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MessageRepos extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);//метод для фильтра
}
