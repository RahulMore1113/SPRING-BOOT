package com.rahul.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
@PropertySource(value = "com/rahul/properties/input.properties")
public class Company2 {

	private String name;
	private String location;
	private String size;

	@Override
	public String toString() {
		return "Company2 [name=" + name + ", location=" + location + ", size=" + size + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
