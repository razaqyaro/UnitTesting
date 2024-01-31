package com.example.software_testing_and_automation;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        double r, area, circumference;
        Scanner keyboard = new Scanner(System.in);  // Reading from System.in

        //Ask the user for input
        System.out.println("Enter the radius");
        r = keyboard.nextDouble();

        circumference = 2 * Math.PI * r;
        area = Math.PI * r * r;

        System.out.println("For a circle with radius "+ r +",");
        System.out.println(" the circumference is "+ circumference);
        System.out.println(" and the area is "+ area+".");

        keyboard.close();

    }
}
