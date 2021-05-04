package com.divergentsl.cmsjpa.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.divergentsl.cmsjpa.config.AppConfig;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	AdminPanel adminPanel = context.getBean(AdminPanel.class);
    	adminPanel.adminPanel();
    	
  	}

}
