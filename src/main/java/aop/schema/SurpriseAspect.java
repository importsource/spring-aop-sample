package aop.schema;

import org.aspectj.lang.ProceedingJoinPoint;

public class SurpriseAspect {

    public void hul(ProceedingJoinPoint pjp) {

        System.out.println("헐~");

        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("헐~~~");
    }

}
