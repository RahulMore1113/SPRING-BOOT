package com.rahul.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("dotNet")
public class DotNetCourseMaterial implements ICourse {

	private Logger logger = LoggerFactory.getLogger(DotNetCourseMaterial.class);

	static {
		System.out.println("DotNetCourseMaterial.enclosing_method()");
	}

	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial.DotNetCourseMaterial()");
	}

	@Override
	public String courseContent() {

		logger.debug("Control entering into DotNetCourseMaterial :: courseContent()");
		System.out.println("DotNetCourseMaterial.courseContent()");

		return "1. C#oops 2. C#ExceptionHandling 3. C#Collections";
	}

	@Override
	public float price() {
		return 5030;
	}

}
