package com.example.mining;

import org.springframework.stereotype.Component;

@Component("sha")
public class SHA256 extends Algorithm{

    @Override
    void start() {
        System.out.println("SHA256 started");
    }
}
