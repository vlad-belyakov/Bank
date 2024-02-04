package com.lesson.bank.security;

import com.lesson.bank.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Authentication {

    private AnnotationConfigApplicationContext context;

    public Authentication(){
         context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

}
