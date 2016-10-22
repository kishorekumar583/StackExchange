package com.stack.portal.service;

import com.stack.portal.dao.model.UserDao;
import com.stack.portal.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by kishore on 10/22/16.
 */
@Component
public interface UserService {
    public UserDao createUser(User user);
}
