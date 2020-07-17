package org.test.BeginnerSpring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;


@Aspect
@Component
public class helper {
	
	@Pointcut(value = "execution(* org.test.BeginnerSpring.Car.*(..))")
	private void Giveme() {
		
	}
	
	
	@Around("Giveme()")
	public void Print(ProceedingJoinPoint point) throws Throwable {
		ObjectMapper om = new ObjectMapper();
		Object[] result = point.getArgs();
		
		System.out.println("Hey Aspect Invoked " + om.writeValueAsString(result));// Get Function Name
		Object procced = point.proceed(result);
		System.out.println("return :" + procced);
	}
	

}
