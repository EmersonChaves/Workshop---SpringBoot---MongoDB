package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Post;
import com.example.demo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	User findOne(String id);
	
	List<Post> findByTitleContaining(String text);

}
