package com.stack.portal.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kishore on 10/22/16.
 */

@RestController
public class UserResource {

    @RequestMapping("/")
    public String sendMessage(){
        return "Hello Message";
    }
}
