package com.hibenettest.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TraceAdvice {
	/*@Before("execution(* com.hibenettest.CustomerService.*(..))")
	public void tracebeforemethod(JoinPoint joinpoint) {
		System.out.println("Advise___________>before execution of method ");// + joinpoint.getSignature().getName());
	}

	@Before("execution(* edu.mum.cs.cs544.examples.AccountService.*(..)) && args(accountNumber, amount)")
	public void tracebeforemethod(JoinPoint joinpoint, long accountNumber, double amount) {
		System.out.print("before execution of method " + joinpoint.getSignature().getName());
		System.out.println(", Account# " + accountNumber + ", Amount = " + amount);
	}

*/


//
//	@Around("execution(* com.hibenettest.persistance.PersonDAOImpl.*(..))")
//	public Object profile(ProceedingJoinPoint call) throws Throwable {
//		StopWatch clock = new StopWatch("");
//		clock.start(call.toShortString());
//
//		Object object = call.proceed();
//
//		clock.stop();
//
//		System.out.println(clock.prettyPrint());
//
//		return object;
//	}
//	@After("execution(* com.hibenettest.persistance.PersonDAOImpl.*(..))")
//	public void traceaftermethod(JoinPoint joinpoint) {
//		System.out.println("Advise___________>Dao Executed successfully " + joinpoint.getSignature().getName());
//	}
}