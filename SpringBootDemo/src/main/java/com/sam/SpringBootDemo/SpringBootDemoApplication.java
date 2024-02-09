package com.sam.SpringBootDemo;

import com.sam.SpringBootDemo.model.Coder;
import com.sam.SpringBootDemo.model.Laptop;
import com.sam.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

//		Coder coder = context.getBean(Coder.class);
//		coder.Code();

		Laptop laptop = context.getBean(Laptop.class);

		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(laptop);

	}

}
