package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("File2.xml");
		Question question = (Question)context.getBean("Question");
		question.displayInfo();
		

	}

}
