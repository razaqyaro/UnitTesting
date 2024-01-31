package com.example.software_testing_and_automation;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        int side_1 = keyboard.nextInt();

        System.out.println("Enter side 2: ");
        int side_2 = keyboard.nextInt();

        System.out.println("Enter side 3: ");
        int side_3 = keyboard.nextInt();

        if(isTriangle(side_1, side_2, side_3)){
            System.out.println("This is a triangle.");
        }
        else{
            System.out.println("This is not a triangle");
        }

     keyboard.close();
    }
    public static boolean isTriangle(double a, double b, double c) {
        if((a + b > c) && (a + a > b) && (b + c > a)){
            return true;
        }
        return false;
    }
}
