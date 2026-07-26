package com.internship.greeting;
import java.util.Scanner;
public class PersonalizedGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You will turn 100 after " + (100 - age) + " years.");

        sc.close();
    }
}
