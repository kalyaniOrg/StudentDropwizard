package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {
	@NotEmpty
	@JsonProperty
	private String template;
	private String city;
	
	@JsonProperty
	private long id;

	@NotEmpty
	@JsonProperty
	private String defaultName = "Stranger";

	public String getTemplate() {
		return template;
	}

	public String getDefaultName() {
		return defaultName;
	}

	public String getCity() {
		return city;
	}
	@JsonProperty
	public long getId() {
		return id;
	}
	
	
}
