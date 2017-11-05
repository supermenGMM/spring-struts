package com.mm.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopTest1 {
	
	public void before(){
		
		System.out.println("----before----");
	}
	
	public void after()
	{
		System.out.println("-----after----");
	
	}
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("-around之前--");
//		如果有这个权限
		if(2==2){
			joinPoint.proceed();
		}
		System.out.println("===around之后=====");
	}
	
	public void exception(){
		System.out.println("异常处理");
	}
}
