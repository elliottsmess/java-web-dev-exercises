package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:    ");
        double radius = input.nextDouble();
        double circleArea = Circle.getArea(radius);
        System.out.println("The area of a circle of radius" + radius + "is " + circleArea);


        input.close();

    }
}