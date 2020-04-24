package com.gara;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;

/**
 * @author GARA
 */
public class AppTest {

	public static void main(String[] args) throws ClassNotFoundException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		AppConfig appConfig = context.getBean(AppConfig.class);
		appConfig.setId(1);
		appConfig.setName("Java");
		System.out.println(appConfig.getName());
		System.out.println();
		Iterator<String> beanNamesIterator = context.getBeanFactory().getBeanNamesIterator();
		while (beanNamesIterator.hasNext()) {
			String s = beanNamesIterator.next();
			System.out.println("bean name: " + s);
		}
	}
}
