package com.mclares.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mclares.workshopmongo.domain.Post;
import com.mclares.workshopmongo.repository.PostRepository;
import com.mclares.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Post post = repo.findById(id).orElse(null);
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return post;
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
