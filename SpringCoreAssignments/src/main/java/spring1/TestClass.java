package spring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("file.xml");
		context.registerShutdownHook();
		CustomerClass customer = (CustomerClass)context.getBean("customer");
		customer.display();

	}

}
