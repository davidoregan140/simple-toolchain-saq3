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
		//System.out.println("\n" + paperBean.getTitle() + "\n");
		//System.out.println(paperBean.getEditorsList() + "\n");
		System.out.println(paperBean.toString());
		System.out.println(paperBean.getEditorsList());
		
		
		//trying with collections
		
//		Editor sportsEditor=(Editor)context.getBean("sportsEditor");
//		System.out.println(sportsEditor.toString());
//
//		Editor entertainmentEditor=(Editor)context.getBean("entertainmentEditor");
//		System.out.println(entertainmentEditor.toString());
//		
//		Editor businessEditor=(Editor)context.getBean("businessEditor");
//		System.out.println(businessEditor.toString());
//		
//		Editor newsEditor=(Editor)context.getBean("newsEditor");
//		System.out.println(newsEditor.toString());
		
	}
}
