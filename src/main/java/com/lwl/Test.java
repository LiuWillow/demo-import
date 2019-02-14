package com.lwl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lwl
 * @date 2019/2/14 14:23
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String s : applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }
}