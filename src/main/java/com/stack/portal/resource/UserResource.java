package com.stack.portal.resource;

import com.stack.portal.model.User;
import com.stack.portal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.Produces;

/**
 * Created by kishore on 10/22/16.
 */

@RestController
@Produces("application/json")
public class UserResource {

    private static final Logger logger= LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String sendMessage(){
        User user=new User();
        user.setUserName("test123");
        user.setFistName("TESTFIRST");
        user.setLastName("TESTLAST");
        user.setContactNumber("947689784789");
        user.setPassword("TESTPASS");

        logger.info("testLOGGER");
        System.out.println(userService.createUser(user));
        return "Hello Message";
    }
}
