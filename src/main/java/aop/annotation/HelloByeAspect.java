package aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class HelloByeAspect {

    @Pointcut("execution(* aop.base.Employee.work(..))")
     public void helloPointcut() {
    }

    @Before("helloPointcut()")
    public void helloBeforeAdvice() {
        System.out.println("안녕하세요.");
    }

    @After("helloPointcut()")
    public void byeAfterAdvice() {
        System.out.println("안녕히가세요.");
    }

}
