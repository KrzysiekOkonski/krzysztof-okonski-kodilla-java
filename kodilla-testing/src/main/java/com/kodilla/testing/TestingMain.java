package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.Random;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        Random random = new Random();
        int y = random.nextInt(10000);
        int x = random.nextInt(10000);
        if (calculator.add(x,y) == x+y){
            System.out.println("adding test OK");
        } else {
            System.out.println("adding test error!");
        }
        if (calculator.subtract(x,y) == x-y){
            System.out.println("subtracting test OK");
        } else {
            System.out.println("subtracting test error!");
        }

    }
}
