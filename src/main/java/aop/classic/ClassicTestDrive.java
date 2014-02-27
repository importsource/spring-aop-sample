package aop.classic;

import aop.base.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassicTestDrive {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classic-config.xml");
        Employee employee = (Employee) ac.getBean("evilEmployee");

        employee.work();
    }
}
