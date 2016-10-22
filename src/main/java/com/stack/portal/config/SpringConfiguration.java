package com.stack.portal.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by Kishore on 10/22/16.
 */

@Configuration
@ComponentScan(value="com.stack.portal")
public class SpringConfiguration extends AbstractMongoConfiguration{

    @Override
    protected String getDatabaseName() {
        return "stackexchange";
    }

    public Mongo mongo() throws Exception{
       return new MongoClient("localhost",27017);

   }

}
