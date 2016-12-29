package com.bjsxt.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
//	@Pointcut("execution(public * com.bjsxt.service..*.add(..))")
//	public void myMethod(){};
//	
//	@Before("myMethod()")
//	public void before() {
//		System.out.println("method before");
//	}
//	
//	@Around("myMethod()")
//	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("method around start");
//		pjp.proceed();
//		System.out.println("method around end");
//	}
	@Before("execution(public void com.bjsxt.dao.impl.UserDAOImpl.save(com.bjsxt.model.User))")
	public void before() {
		System.out.println("method before");
	}
}
