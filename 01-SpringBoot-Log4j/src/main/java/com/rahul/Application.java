package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.rahul.beans.Student;

@SpringBootApplication
@ImportResource(locations = "applicationContext.xml")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Student student = context.getBean(Student.class);
		student.preparation("java");

		((ConfigurableApplicationContext) context).close();
	}

}
