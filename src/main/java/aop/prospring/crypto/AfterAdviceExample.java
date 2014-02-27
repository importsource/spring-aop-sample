package aop.prospring.crypto;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class AfterAdviceExample {

    public static void main(String[] args) {
        KeyGenerator keyGen = getKeyGenerator();

        for(int x = 0; x < 10; x++) {
            try {
                long key = keyGen.getKey();
                System.out.println("Key: " + key);
            } catch(SecurityException ex) {
                System.out.println("Weak Key Generated!");
            }
        }

        System.out.println(getGreeting().hello());
    }

    private static KeyGenerator getKeyGenerator() {

        KeyGenerator target = new KeyGenerator();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new WeakKeyCheckAdvice());

        return (KeyGenerator)factory.getProxy();
    }


    private static Greeting getGreeting() {

        Greeting target = new Greeting();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new WeakKeyCheckAdvice());

        return (Greeting)factory.getProxy();

    }

}
