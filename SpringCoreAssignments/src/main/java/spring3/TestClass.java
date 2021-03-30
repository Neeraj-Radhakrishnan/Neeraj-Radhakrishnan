package spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("File3.xml");
		BankAccountController controller = (BankAccountController)context.getBean("bankAccountController");
		double amountLeft = controller.withdraw(controller.getAccount().getAccountId(), 10000);
	    System.out.println(amountLeft);
		System.out.println(controller);		
	}


}
