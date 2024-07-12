package com.indeed.server.dao;

import com.indeed.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDAO extends MongoRepository<PostModel, String>{
}
