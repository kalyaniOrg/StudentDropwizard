package com.example.helloworld;

import com.example.helloworld.resources.HelloWorldResource;
import com.example.helloworld.resources.StudentDao;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class HelloWorldService extends Service<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
    	//String s[]={"server","hello-world.yml"};
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
       // bootstrap.setName("hello-world");
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
    	String template = configuration.getTemplate();
        String defaultName = configuration.getDefaultName();
        long id=configuration.getId();
        String city=configuration.getCity();
       // environment.addResource(new HelloWorldResource(new StudentDao()));    
        environment.addResource(new HelloWorldResource());    

    }   
}