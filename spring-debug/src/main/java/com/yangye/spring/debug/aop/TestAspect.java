package com.yangye.spring.debug.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {


	@Pointcut("execution(* com.yangye.spring.debug.aop.Test.*(..))")
	public void pointcut() {}

	@Before("pointcut()")
	public void before() {
		System.out.println("before...");
	}
}
