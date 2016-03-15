package com.caveofprogramming.spring.test.testprog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/testprog/beans/beans.xml	");
    	
        Person person = (Person)context.getBean("person");
        person.speak();
        
        Address address = (Address)context.getBean("address");
        
        System.out.println(person);
        System.out.println(address);
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
