package com.impl;

import com.interfaces.MyComponent;
import org.springframework.stereotype.Component;

@Component
public class MyComponentImpl implements MyComponent {

    @Override
    public void print() {
        System.out.println("hello");
    }

}
