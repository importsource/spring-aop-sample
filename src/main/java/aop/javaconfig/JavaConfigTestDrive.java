package aop.javaconfig;

import aop.base.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class JavaConfigTestDrive {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee excellentEmployee = ctx.getBean("excellentEmployee", Employee.class);

        excellentEmployee.work();


    }
}
