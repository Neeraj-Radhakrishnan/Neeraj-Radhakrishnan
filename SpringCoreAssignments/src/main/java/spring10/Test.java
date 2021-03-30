package spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args )
    {
        //Address address = new Address();
        ApplicationContext context = new ClassPathXmlApplicationContext("File10.xml");
        Employee employee = (Employee) context.getBean("Employee");
    	employee.displayInfo();
    	
    }
}