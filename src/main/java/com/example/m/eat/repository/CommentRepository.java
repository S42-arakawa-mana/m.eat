package com.example.m.eat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.m.eat.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
