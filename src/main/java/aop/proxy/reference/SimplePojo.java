package aop.proxy.reference;

import org.springframework.aop.framework.AopContext;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class SimplePojo implements Pojo {

    @Override
    public void foo() {
        System.out.println("foo... call bar()");
        // this next method invocation is a direct call on the 'this' reference
        this.bar();
        // ((Pojo) AopContext.currentProxy()).bar();
    }

    @Override
    public void bar() {
        System.out.println("bar");
    }
}
