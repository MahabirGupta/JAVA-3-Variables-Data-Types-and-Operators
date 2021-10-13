package com.variable.naming;

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = input.nextLine();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = Integer.parseInt(input.nextLine());
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter your gender ");
        String gender = input.nextLine();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter your job preference ");
        String jobPref = input.nextLine();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Please enter your nationality ");
        String nat = input.nextLine();
        Scanner input5 = new Scanner(System.in);
        System.out.println("Please enter your blood type ");
        String blType = input.nextLine();
        Scanner input6 = new Scanner(System.in);
        System.out.println("Please enter current year ");
        int curyear = Integer.parseInt(input.nextLine());
        int dob = curyear - age;
        System.out.println("You were born in the year " + dob);
    }
}

