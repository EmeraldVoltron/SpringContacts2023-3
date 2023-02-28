package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//import beans.Address;
import beans.Contact;
import controller.BeanConfiguration;
//import repository.ContactRepository;

@SpringBootApplication
public class SpringContacts20233Application /* implements CommandLineRunner */ {

	public static void main(String[] args) {
		SpringApplication.run(SpringContacts20233Application.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Contact c = appContext.getBean("contact", Contact.class);
		
		System.out.println(c.toString());
	
	}
	
//	@Autowired
//	ContactRepository repo;
//	
//	public void run(String...args) throws Exception{
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		Contact c = appContext.getBean("contact", Contact.class);
//		c.setRelationship("best friend");
//		repo.save(c);
//		
//		Contact d = new Contact("Sandra Boyton", "555-555-5557", "friend");
//		Address a = new Address("123 Main Street", "Altoona", "IA");
//		d.setAddress(a);
//		repo.save(d);
//		
//		List<Contact> allMyContacts = repo.findAll();
//		for(Contact people : allMyContacts) {
//			System.out.println(people.toString());
//		}
//		
//		((AbstractApplicationContext) appContext).close();
//	}
		
}