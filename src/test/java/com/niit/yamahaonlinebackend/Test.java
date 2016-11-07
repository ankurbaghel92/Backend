package com.niit.yamahaonlinebackend;

import java.lang.annotation.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext();
				c.refresh();

		/*Object o1 = b.getBean("user");
		Object o2 = b.getBean("user");
		Object o4 = b.getBean("user");
*/		c.scan("com.niit");
		c.getBean("applicationcontextconfig");
		System.out.println("datasource Instance is Created");

/*		c.getBean("user");
		System.out.println("User Instance is Created");
*/
	}

}
