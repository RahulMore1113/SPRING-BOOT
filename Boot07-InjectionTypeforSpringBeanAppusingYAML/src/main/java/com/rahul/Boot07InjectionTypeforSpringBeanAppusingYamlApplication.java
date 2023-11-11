package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.beans.Employee;

@SpringBootApplication
public class Boot07InjectionTypeforSpringBeanAppusingYamlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(Boot07InjectionTypeforSpringBeanAppusingYamlApplication.class, args);

		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);

		((ConfigurableApplicationContext) context).close();
	}

}
