package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.comp.Company1;
import com.rahul.comp.Company2;

@SpringBootApplication
public class Boot04BulkLoadingAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot04BulkLoadingAppApplication.class, args);

		Company1 company1 = context.getBean(Company1.class);
		System.out.println(company1);

		System.out.println();

		Company2 company2 = context.getBean(Company2.class);
		System.out.println(company2);

		((ConfigurableApplicationContext) context).close();
	}

}
