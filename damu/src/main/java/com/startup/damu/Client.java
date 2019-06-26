package com.startup.damu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {

Employee ref=new Employee();
ref.setEid(315);
ref.setEname("falcon");
ref.setdept("ecee");
System.out.println(ref);
ApplicationContext app =new ClassPathXmlApplicationContext("Employeebean.xml");
Employee e1= (Employee) app.getBean("emp1");
Employee e2= (Employee) app.getBean("emp2");
System.out.println(e1);
System.out.println(e2);
	
	
}
}
