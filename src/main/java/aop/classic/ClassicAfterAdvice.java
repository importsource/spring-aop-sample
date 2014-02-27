package aop.classic;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class ClassicAfterAdvice implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
    System.out.println("안녕히 가세요.");
  }

}
