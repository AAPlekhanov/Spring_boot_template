package com;

import com.entities.User;
import com.interfaces.MyComponent;
import com.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return args -> {
            MyComponent bean = context.getBean(MyComponent.class);
            bean.print();


            userRepository.save(new User("Max"));
        };
    }

}
