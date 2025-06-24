package com.ico.demo;

import java.util.Scanner;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hi welcome we please mention the "
				+ "size of the tabel");
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		System.out.println(size);
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		if(size.equals("long")) {
			Table table = (Table)context.getBean("longTable");
			System.out.println(table.showDetails());
		}
		else if(size.equals("short")) {
			Table table = (Table)context.getBean("shortTable");
			System.out.println(table.showDetails());
		}else {
			System.out.println("not table of this type");
		}
	}

}


// xml prioir knowlage
//
