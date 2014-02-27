package aop.proxy.reference;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by yoyojyv on 2014. 2. 27..
 *
 * 어드바이스가 타겟에 적용되었고 별다른 포인트컷 표현식을 쓰지 않았기 떄문에 모든 메소드에 적용이 되어야 함
 * 프록시 객체를 지나서 타겟 객체에 다다른 뒤에 타겟 객체에서 자기 자신의 메소드를 호출 할 때는 프록시를 거치지 않기 때문에 이렇게 됨.
 * 이걸 self-invocation issue 라고 합니다.
 */
public class SimpleTestDrive {

    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
        factory.addAdvice(new RetryAdvice());
        // factory.setExposeProxy(true);

        Pojo pojo = (Pojo) factory.getProxy();
        pojo.foo();

//        Before advice
//        foo... call bar()
//        bar

    }

}
