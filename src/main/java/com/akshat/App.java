package com.akshat;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        we have to create IOC container
//        ApplicationContext is not a part of Java, it's a part of spring
//        So we have to add dependencies in maven file

        //this line creates a container
        //this is where objects were created by looking xml files
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //getBean give object from container.
        //Since its return type is Object, we have to typecast it
        Person per = (Person) context.getBean("per");
        per.code();
    }
}
