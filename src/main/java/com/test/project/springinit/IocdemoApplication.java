package com.test.project.springinit;

import com.test.project.springinit.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //(scanBasePackages = {"com.test.project.springinit.myServices"})

// Note: in above line, "myServices" is a package name
class SpringInitApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpringInitApplication.class, args);

        // get the bean from spring container
        Coach theCoach = context.getBean(Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
