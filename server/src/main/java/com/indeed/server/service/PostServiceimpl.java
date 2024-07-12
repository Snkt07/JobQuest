package com.indeed.server.service;

import com.indeed.server.dao.PostDAO;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceimpl implements PostService{


    @Autowired
    PostDAO postDao;

    @Override
    public PostModel savePost(PostDTO postDTO) {
        PostModel postModel=new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setType(postDTO.getType());
        postModel.setSalary(postDTO.getSalary());
        postModel.setExperience(postDTO.getExperience());
        postModel.setDescription(postDTO.getDescription());
        postModel.setTechnology(postDTO.getTechnology());

        return postDao.save(postModel);

    }

    @Override
    public List<PostModel> getAllPosts() {
        return postDao.findAll();
    }
}
