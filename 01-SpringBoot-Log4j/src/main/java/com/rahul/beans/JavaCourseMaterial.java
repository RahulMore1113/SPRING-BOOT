package com.rahul.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements ICourse {

	private Logger logger = LoggerFactory.getLogger(JavaCourseMaterial.class);

	static {
		System.out.println("JavaCourseMaterial.enclosing_method()");
	}

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial.JavaCourseMaterial()");
	}

	@Override
	public String courseContent() {

		logger.debug("Control entering into JavaCourseMaterial :: courseContent()");
		System.out.println("JavaCourseMaterial.courseContent()");

		return "1. Servlet 2. Hibernate 3. Spring...";
	}

	@Override
	public float price() {
		return 100000;
	}

}
