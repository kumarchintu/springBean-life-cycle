package org.inetsolv.SpringCoreLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
			ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
			Employee employee = container.getBean(Employee.class);
			System.out.println(employee);			
			((AbstractApplicationContext)container).close();
	}
}
