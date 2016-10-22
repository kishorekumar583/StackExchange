package com.stack.portal.dao;

import com.stack.portal.dao.model.UserDao;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by saivahinthoodi on 10/22/16.
 */
public interface UserRepository extends MongoRepository<UserDao, String>{

    public UserDao findByFirstName(String firstName);
    public List<UserDao> findByLastName(String lastName);


}
