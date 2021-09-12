/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;

public class Assignment_1_Exercise_16 {
    public static void main(String[] args) {

        int age;
        Scanner sc= new Scanner(System.in);
        System.out.print("What is your age? ");  //print prompt using System.out.print()
        age=sc.nextInt();     //read age from user
        if(age>=16)           //check if age>=16, if true, then print prompt "old enough"
            System.out.println("You are old enough to legally drive");
        else               //if false, i.e. if age<16, print "not old enough"
            System.out.println("You are not old enough to legally drive");

    }
}

