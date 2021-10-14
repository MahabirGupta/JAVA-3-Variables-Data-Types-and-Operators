package com.generation.java;
import java.util.Scanner;
import java. lang. Math.*;
public class Main {
//class Pie {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter diameter of circle: ");
        int diameter = Integer.parseInt(input.nextLine());
        double area;
        double radius = diameter / 2;
        double perimeter;
        area = Math.PI * radius * radius;
        double roundDbl = Math.round(area*100.0)/100.0;
        perimeter = 2 * Math.PI * radius;
        double roundDbl1 = Math.round(perimeter*100.0)/100.0;
        System.out.println("Area of circle is " + roundDbl);
        System.out.println("Perimeter of circle is " + roundDbl1);
    }

}
    //}

