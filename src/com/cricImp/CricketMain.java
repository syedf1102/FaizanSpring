package com.cricImp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cricket.Cricket;

public class CricketMain {

	public static void main(String[] args) {
		ApplicationContext a=new FileSystemXmlApplicationContext("spring.xml");
		Cricket c=a.getBean("ipl",Cricket.class);
		c.showTeams();
	}

}
