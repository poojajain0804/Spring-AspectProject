package com.poojajain0804.aop.initUtil;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component 
public class InitilizationHook implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("After post processor done "+beanName);
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("Before post processor starting "+beanName);
		return bean;
	}
	
	

}
