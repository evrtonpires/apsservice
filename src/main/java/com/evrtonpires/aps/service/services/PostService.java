package com.evrtonpires.aps.service.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.evrtonpires.aps.service.domain.PostDomain;
import com.evrtonpires.aps.service.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public PostDomain findById(Integer id) {
		Optional<PostDomain> obj = postRepository.findById(id);
		return obj.orElse(null);
	}
	
	public PostDomain insertPost(PostDomain obj) {
		obj.setId(null);
		return postRepository.save(obj);
	}

}
