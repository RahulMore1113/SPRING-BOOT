package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.beans.BillGenerator;

@SpringBootApplication
public class Boot05ValueAnnotationAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Boot05ValueAnnotationAppApplication.class, args);

		BillGenerator generator = context.getBean(BillGenerator.class);
		System.out.println(generator);

		((ConfigurableApplicationContext) context).close();

	}

}
