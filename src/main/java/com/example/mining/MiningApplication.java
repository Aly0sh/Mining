package com.example.mining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiningApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("==========================================================================");
        Miner miner = context.getBean("miner", Miner.class);
        miner.mining();
    }

}
