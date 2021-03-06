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
    	
    	FruitBasket basket = (FruitBasket)context.getBean("basket");
    	
    	System.out.println(basket);
    	
        ((ClassPathXmlApplicationContext) context).close();
    }
}
