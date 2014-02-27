package aop.prospring.profiling;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class ProfilingExample {

    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        bean.doSomeWork(10000000);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new ProfilingInterceptor());

        return (WorkerBean)factory.getProxy();
    }
}
