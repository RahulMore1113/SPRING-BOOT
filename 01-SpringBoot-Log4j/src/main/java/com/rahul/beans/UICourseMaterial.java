package com.rahul.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("ui")
public class UICourseMaterial implements ICourse {

	private Logger logger = LoggerFactory.getLogger(UICourseMaterial.class);

	static {
		System.out.println("UICourseMaterial.enclosing_method()");
	}

	public UICourseMaterial() {
		System.out.println("UICourseMaterial.UICourseMaterial()");
	}

	@Override
	public String courseContent() {

		logger.debug("Control entering into UICourseMaterial :: courseContent()");
		System.out.println("UICourseMaterial.courseContent()");

		return "1. HTML 2. CSS 3. JS";
	}

	@Override
	public float price() {
		return 4323;
	}

}
