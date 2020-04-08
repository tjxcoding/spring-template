package indi.spring.template.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tjx
 * @since 2020-4-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void say() throws Exception {
        helloService.say("hello world");
    }

}