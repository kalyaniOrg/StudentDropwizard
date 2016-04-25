package com.example.helloworld.resources;

import com.example.helloworld.core.Student;
import com.google.common.base.Optional;
import com.sun.jersey.spi.resource.PerRequest;
import com.yammer.dropwizard.validation.Validated;
import com.yammer.metrics.annotation.Timed;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
	
   /* public StudentDao studentDao;	
    private String template;
    private String defaultName;
    private long id;
    private String city;
    private AtomicLong counter;*/

    public HelloWorldResource() {
		
    }
  /* public HelloWorldResource(long id,String defaultName,String city) {
        this.template = template;
        this.defaultName = defaultName;
        this.city=city;
        this.counter = new AtomicLong();
        this.id=id;
    }*/
   
   /*public HelloWorldResource(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}*/
    /*
   @GET
    @Timed
    public Student sayHello(@QueryParam("name") Optional<String> name) {
        return new Student(id,
                          String.format(template, name.or(defaultName)),city);
    }*/
    
    // -------- POST EXECUTION USING PATH PARAMETER ----------
    /*
    @POST
    @Path("/{id}")
    @Consumes("application/json")    
    public  Response parameterDemoMethod(Student s,@PathParam("id") String id) {
    	//String result = "Student created : " + s;
		return Response.status(201).entity(s).build();
    	//return id + s;
    }   
    */
    
    @GET
    @Path("/showAll")
    public Response sayHello() {
    		List<Student> users=AccessInfo.getUsers();    	
    		return Response.status(201).entity(users).build();  	
    }
    
    @GET
    @Path("/show/{id}")
    public Response sayHello1(@PathParam("id") long id) {
    		Student stud=AccessInfo.getUser(id);    	
    		return Response.status(201).entity(stud).build();  	
    }
}