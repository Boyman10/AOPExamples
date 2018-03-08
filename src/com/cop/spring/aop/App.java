package com.cop.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// taking the context definition files from the class path, 
		// interpreting plain paths as class path resource names that include 
		// the package path
		// The Spring Framework core is an IoC container used to manage beans.
		// 2 basic types of containers in Spring – the Bean Factory and the 
		// Application Context.
		// The later one is more used
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/cop/spring/aop/bean.xml");
		
		Camera camera = (Camera) context.getBean("camera");
		camera.snap();
		
		context.close();
	}

}
