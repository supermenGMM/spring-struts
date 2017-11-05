package com.mm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AopAutoproxy {
	@Before(value="execution(* com.mm.service.*.*(..))")
	public void before(){
		System.out.println("----before 注解方式----");
	}
	
	@AfterReturning(value="execution(* com.mm.service.BookService.add(..))")
	public void after()
	{
		System.out.println("-----after-注解方式---"); 
	}
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("-around之前-注解方式-");
//		如果有这个权限
		if(2==2){
			joinPoint.proceed();
		}
		System.out.println("===around之后=注解方式====");
	}
	
	public void exception(){
		System.out.println("异常处理----注解方式");
	}
}
