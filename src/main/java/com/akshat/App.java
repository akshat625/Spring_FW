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
        Person per1 = (Person) context.getBean("per1");
//        per1.setAge(21);
        System.out.println(per1.getAge());
        per1.code();
//        if we write getBean multiple time, it creates only one object
//        for creating multiple object, use scope as prototype in xml
//        Person per2 = (Person) context.getBean("per1");


    }
}
