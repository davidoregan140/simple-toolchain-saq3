package ie.cit.soft8027.saq3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cit.soft8027.saq3.domain.Editor;
import ie.cit.soft8027.saq3.domain.Newspaper;

public class App {
	
	private static ApplicationContext context;
	
	
	public static void main (String args[]){
	
		context=new ClassPathXmlApplicationContext("configuration.xml"); 
		
		Newspaper paperBean = (Newspaper)context.getBean("newspaper");

		System.out.println(paperBean.toString());

		

		
	}
}
