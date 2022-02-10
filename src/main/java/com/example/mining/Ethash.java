package com.example.mining;

import org.springframework.stereotype.Component;

@Component("ethash")
public class Ethash extends Algorithm{

    @Override
    void start() {
        System.out.println("Ethash started");
    }
}
