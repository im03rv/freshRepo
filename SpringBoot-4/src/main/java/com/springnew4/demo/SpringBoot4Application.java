package com.springnew4.demo;

import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot4Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter the rounds: ");
		
		int round = sc.nextInt();
		
		Random number = new Random();
		
		int num = number.nextInt(100);
		 
		System.out.println("Rondom number Generated....");
		
		for(int i = 0; i < round; i++) {
			System.out.println("Guess the number: ");
			int n = sc.nextInt();
			
			if(n == num) {
				System.out.println("You win!!!");
				break;
			}
			else if(num > n) {
				System.out.println("your number is samll, pls choose greater!!!");
			}
			else {
				System.out.println("your number is larger , pls choose smaller!!!");
			}
		
		}
		
		System.out.println("you Loose!!! and \n the rondom number is " + num);
		
		SpringApplication.run(SpringBoot4Application.class, args);
		
	}

}
