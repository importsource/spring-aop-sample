package aop.prospring;

import aop.proxy.hello.MessageWriter;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class SimpleBeforeAdvice implements MethodBeforeAdvice {

    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        // 프록시 만들기
        ProxyFactory pf = new ProxyFactory();

        pf.addAdvice(new SimpleBeforeAdvice());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();

        // 메시지 출력하기

        proxy.writeMessage();
        System.out.println("");

        proxy.writeMessage("월드");
        System.out.println("");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("======================================");
        System.out.println("Before method : " + method.getName());
        System.out.println("Before args :" + args);
        System.out.println("Before args.length :" + args.length);

        for (int i = 0; i < args.length; i++) {
            Object argument = args[i];

            if (argument != null) {
                System.out.println("Before " + i + " argument.getClass() : " + argument.getClass());
                System.out.println("Before argument[" + i + "] : " + argument);
            }
        }

        System.out.println("======================================");


    }
}
