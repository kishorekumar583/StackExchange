package com.stack.portal.service.impl;

import com.stack.portal.dao.UserRepository;
import com.stack.portal.dao.model.UserDao;
import com.stack.portal.model.User;
import com.stack.portal.service.UserService;
import com.stack.portal.util.UserValidationUtil;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by saivahinthoodi on 10/22/16.
 */

@Component
public class UserServiceImpl implements UserService{

    @Inject
    private UserRepository userRepository;
    @Inject
    private UserValidationUtil userValidationUtil;
    @Override
    public UserDao createUser(User user) {
        UserDao userDao=userValidationUtil.validateUser(user);
        userRepository.deleteAll();
        return userRepository.save(userDao);
    }
}
