package com.example.mining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("miner")
public class Miner {

    @Autowired
    private SHA256 sha256;

    @Autowired
    private Ethash ethash;

    Algorithm algorithm;

    @Value("${algorithm_name}")
    private String algorithm_name;

    @Autowired
    public void createAlgorithm(){
        if (algorithm_name.equals("Ethash")){
            algorithm = ethash;

        } else if (algorithm_name.equals("SHA256")){
            algorithm = sha256;
        } else {
            algorithm = null;
        }
    }

    public void mining(){
        if (algorithm == null){
            System.out.println("Такого алгоритма не существует");
            return;
        }
        algorithm.start();
    }

}
