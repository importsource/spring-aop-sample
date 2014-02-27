package aop.annotation;

import aop.base.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTestDrive {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation-config.xml");
        Employee employee = (Employee) ac.getBean("excellentEmployee");

        employee.work();
    }
}
