package org.test.BeginnerSpring;

import java.io.ObjectInputStream.GetField;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration// Tell to spring this class is Configuration
@ComponentScan(basePackages = "org.test.BeginnerSpring")// Tell to Spring where search the packages
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext(App.class); 
    //  ApplicationContext  resposible to activate the beans and the dependency ,and he know do it with Argument we set in the Brackets(App.class)
    //  AnnotationConfigApplicationContext its type of ApplicationContext thats mean the Configuration will be in Annotations ,App.class need be with Annotation ,
    //  @Configuration And @ComponentScan(basePackages = "Name of own Package")
       
    	Car car =  app.getBean(Car.class);// getBean Which class you want to bring to your reference
    
    	car.setName("Bmw");

        String str = car.drive();
        
        


        
        
    }
}
