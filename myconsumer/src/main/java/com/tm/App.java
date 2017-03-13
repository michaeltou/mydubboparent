package com.tm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/3/9.
 */
public class App {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-dubbo.xml"});
        HelloService helloService = (HelloService) ctx.getBean("helloService");
        System.out.println(helloService.sayHello("touming"));
    }


}
