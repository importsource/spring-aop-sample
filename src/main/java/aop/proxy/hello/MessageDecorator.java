package aop.proxy.hello;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by yoyojyv on 2014. 2. 27..
 *
 * MethodInterceptor 인터페이스는 AOP 연합 표준 인터페이스로 메서드 호출 조인 포인트에 대한 어라운드 어드바이스를 구현할 때 사용
 */
public class MessageDecorator implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("Hello ");

        Object retVal = invocation.proceed();

        System.out.print("!");
        return retVal;
    }

}
