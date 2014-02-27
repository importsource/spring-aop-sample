package aop.proxy.hello;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by yoyojyv on 2014. 2. 27..
 *
 * MessageDecorator 어드바이스 위빙하기
 */
public class HelloWorldWeaver {

    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        // 프록시 만들기
        ProxyFactory pf = new ProxyFactory();

        pf.addAdvice(new MessageDecorator());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();

        // 메시지 출력하기
        target.writeMessage();
        System.out.println("");
        proxy.writeMessage();
    }
}
