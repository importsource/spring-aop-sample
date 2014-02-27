package aop.prospring.profiling;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * Created by yoyojyv on 2014. 2. 27..
 *
 * Around advice
 */
public class ProfilingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // start the stop watch
        StopWatch sw = new StopWatch();

        System.out.println("실행 시작.");
        sw.start(invocation.getMethod().getName());

        // 실행
        Object returnValue = invocation.proceed();

        System.out.println("실행 완료.");
        sw.stop();


        dumpInfo(invocation, sw.getTotalTimeMillis());

        System.out.println(sw.prettyPrint());
        return returnValue;
    }

    private void dumpInfo(MethodInvocation invocation, long ms) {
        Method m = invocation.getMethod();
        Object target = invocation.getThis();
        Object[] args = invocation.getArguments();
        System.out.println("Executed method: " + m.getName());
        System.out.println("On object of type: " +
                target.getClass().getName());
        System.out.println("With arguments:");
        for (int x = 0; x < args.length; x++) {
            System.out.print(" > " + args[x]);
        }
        System.out.print("\n");
        System.out.println("Took: " + ms + " ms");


    }

}
