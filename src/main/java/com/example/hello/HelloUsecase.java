package com.example.hello;

import javax.enterprise.context.Dependent;

@Dependent
public class HelloUsecase {

    public String hello(final String name) {
        return "hello " + name;
    }

}
