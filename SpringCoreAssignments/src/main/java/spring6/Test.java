package spring6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {public static void main( String[] args )
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
context.scan("SpringAssignments.Assignment6");
context.refresh();
Details dbdet = context.getBean(Details.class);

dbdet.printDBConfigs();
context.close();
}
}
