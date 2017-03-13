package com.tm;

import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/3/9.
 */

@Service("helloService")
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String word) {
        return "Hello, " + word;
    }
}
