package com.example.myfirstspringprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class MyFirstSpringProgramApplication {

    public static boolean isPrime(int number){
        boolean flag = true;
        for (int i = 2; i > number; i++){
            if (number % i == 0){
                return false;
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check prime");
        int number = scanner.nextInt();

        System.out.println(isPrime(number));
    }

}
