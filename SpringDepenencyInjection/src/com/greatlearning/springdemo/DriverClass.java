package com.greatlearning.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach cCoach = context.getBean("cricketCoach", CricketCoach.class);
		
	      System.out.println(cCoach.getTrainingSchedule());
	      System.out.println(cCoach.getExpertAdvice());

	}
}