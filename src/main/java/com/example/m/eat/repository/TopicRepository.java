package com.example.m.eat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.m.eat.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

	List<Topic> findAllByOrderByUpdatedAtDesc();

}
