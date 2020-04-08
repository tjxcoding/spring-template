package indi.spring.template;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tjx
 * @since 2020-4-8
 */
public class Main {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring-config.xml");
    }
}
