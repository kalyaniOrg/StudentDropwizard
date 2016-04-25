package com.example.helloworld.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private long id;
    private String name;
    private String city;

    public Student()
    {
    	
    }
    public Student(long id,String name,String city) {
        this.id = id;
        this.name = name;
        this.city=city;
    }

   // @JsonIgnore
    @JsonProperty(value="/id")
	public long getId() {
		return id;
	}
    
    @JsonProperty
	public String getName() {
		return name;
	}
    
    @JsonProperty
	public String getCity() {
		return city;
	}
    
    @JsonProperty
	public void setId(long id) {
		this.id = id;
	}
    
    @JsonProperty
	public void setName(String name) {
		this.name = name;
	}
    
    @JsonProperty
	public void setCity(String city) {
		this.city = city;
	}   
    
}