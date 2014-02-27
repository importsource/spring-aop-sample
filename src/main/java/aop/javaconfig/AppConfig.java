package aop.javaconfig;

import aop.annotation.HelloByeAspect;
import aop.base.Employee;
import aop.base.ExcellentEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Employee excellentEmployee() {
        return new ExcellentEmployee();
    }

    @Bean
    public HelloByeAspect helloByeAspect() {
        return new HelloByeAspect();
    }


}

