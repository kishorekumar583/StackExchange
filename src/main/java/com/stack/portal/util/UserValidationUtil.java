package com.stack.portal.util;

import com.stack.portal.dao.model.UserDao;
import com.stack.portal.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by saivahinthoodi on 10/22/16.
 */
@Component
public class UserValidationUtil {


    public UserDao validateUser(User user) {
        UserDao userDao=new UserDao(user.getUserName(),user.getFistName(),user.getLastName(),user.getContactNumber(),user.getPassword());
        return  userDao;
    }
}
