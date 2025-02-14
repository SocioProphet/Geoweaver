package com.gw.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class BeanTool implements ApplicationContextAware {
	
	private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.err.print("testing if this function is called");
		context = applicationContext;
		
		
	}

	public static void setCLIContext(ApplicationContext applicationContext) throws BeansException {

		context = applicationContext;

	}

	public static ApplicationContext getApplicationContext() {
		return context;
 	}
	
	public static <T extends Object> T getBean(Class<T> beanClass) {
		
        return context.getBean(beanClass);
    }
	

}
