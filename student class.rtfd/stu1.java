package chip22.batch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		 practice p=con.getBean(practice.class);
		 model m=con.getBean(model.class);
		 System.out.println(p);
		 System.out.println(m);
	}

}
