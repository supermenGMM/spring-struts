package com.mm.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAutoproxy2 {
	@Pointcut("execution(public * *(..))")
	public void aspectMethod(){
		System.out.println("aopautoProxy2  pointcut切面");
	}
	//拦截所有带的方法的前置通知@Before(value = "aspectMethod() && @annotation(org.springframework.web.bind.annotation.RequestMapping)")

	@Before(value="aspectMethod())")
	public void dosomething(){
		System.out.println("dosomething=========");
	}
	
	@Before("aspectMethod() && args(page)")
	public void dosomething2(int page){
		System.out.println("拦截所有方法参数中有int page的方法");
	}
}
