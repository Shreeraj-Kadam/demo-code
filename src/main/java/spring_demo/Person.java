package spring_demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;  // Import the PostConstruct annotation
import javax.annotation.PreDestroy;
@Component("person")
public class Person {

    @Autowired
    Mobile mobile;

    public void display() {
        System.out.println("This is from Person Class");
        mobile.display();
    }

    public Person() {
    	System.out.println("This is constructor of the Person() class");
	}
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("This is postConstruct() method");
    }
    
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("This is preDestroy() method");
    }
    
    
}
