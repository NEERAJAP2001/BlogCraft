package com.social.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
