package aop.classic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class ClassicBeforeAdvice  implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println("안녕하세요.");
  }

}

