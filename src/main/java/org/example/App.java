package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Alien a1= (Alien) context.getBean("alien");
        a1.age=21;
        a1.code();

//        Laptop l1= (Laptop) context.getBean("laptop");
//        l1.lapi();
        Alien a2= (Alien) context.getBean("alien");
//        a2.age=21;
        a2.code();
        System.out.println(a1.age+" "+a2.age );
    }
}
