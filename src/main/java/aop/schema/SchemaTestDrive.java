package aop.schema;

import aop.base.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchemaTestDrive {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("schema-config.xml");
        Employee employee = (Employee) ac.getBean("evilEmployee");

//        System.out.println("------------- 사악한 사원 출근 -------------");
//
//        employee.work();
//
//        System.out.println("------------- 사악한 사원 퇴근 -------------");

//        employee.playGame();

//        System.out.println();
//        System.out.println();
//
        Employee excellentEmployee = (Employee) ac.getBean("excellentEmployee");

        System.out.println("------------- 훌륭한 사원 출근 -------------");

        excellentEmployee.work();

        System.out.println("------------- 훌륭한 사원 퇴근 -------------");



    }

}
