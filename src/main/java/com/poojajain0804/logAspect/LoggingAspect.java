package com.poojajain0804.logAspect;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger logger =Logger.getLogger(LoggingAspect.class);
	
	@Pointcut("@annotation(org.springframework.stereotype.Controller)")
	public void controllerBean(){
		
	}
	@Pointcut("@annotation(org.springframework.stereotype.Service)")
	public void serviceBean(){
		
	}
	
	@Pointcut("@annotation(org.springframework.stereotype.Repository)")
	public void repositoryBean(){
		
	}
	
	@Pointcut("within(com.poojajain0804.*.*)")
	public void methodPointcut(){
		
	}
	
	@Around("serviceBean() && methodPointcut()")
	public Object aroundServiceMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		logger.debug("----> Invoked "+proceedingJoinPoint.getSignature());
		Date start= new Date();
		Object result= proceedingJoinPoint.proceed();
		Date end= new Date();
		
		logger.debug("----> end of "+proceedingJoinPoint.getSignature()+" total time "+ (end.getTime()-start.getTime()));
		logger.debug("----> return of "+proceedingJoinPoint.getSignature()+" and "+BeanUtils.describe(result));
		return result;
	}
}
