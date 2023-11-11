package com.rahul.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Student {

	private Logger logger = LoggerFactory.getLogger(Student.class);

	static {
		System.out.println("Student.enclosing_method()");
	}

	public Student() {
		System.out.println("Student.Student()");
	}

	@Autowired
	@Qualifier("courseId")
	private ICourse course;

	public void preparation(String example) {

		logger.debug("Control entering inside Student :: preparaton()");

		System.out.println("Student.preparation()");
		System.out.println("Course choose is :: " + course.getClass().getName());

		String courseContent = course.courseContent();
		logger.info("Course content is choosen :: " + courseContent);
		float price = course.price();
		logger.info("Course price is ready :: " + price);
		System.out.println("Preparation is going on using " + courseContent + " material with price :: " + price);
		System.out.println("Preparation completed for :: " + example);
		logger.debug("Control exitig from Student :: preparation()");

	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}
