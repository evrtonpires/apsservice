package com.evrtonpires.aps.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evrtonpires.aps.service.domain.PostDomain;
import com.evrtonpires.aps.service.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public PostDomain findById(Integer id) throws Exception {
		Optional<PostDomain> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new Exception("Nenhum Post encontrado referente ao ID: " + id));
	}

	public List<PostDomain>insertPost(List<PostDomain> obj) {
		for(PostDomain post : obj) {
			post.setId(null);
		}
		return postRepository.saveAll(obj);
	}

}
