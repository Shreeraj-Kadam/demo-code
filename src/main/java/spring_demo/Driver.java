package spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext ap = new AnnotationConfigApplicationContext(Config.class);
		 Person p= (Person)ap.getBean("person");
//		 p.display();
		 ap.close();
	// Shreerj Kadam is a developer
		 
	}
}
