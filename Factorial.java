package com.company;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        /*
        2) Write a program that asks the user for an integer n >= 0,
        and displays n!. Note that 0! = 1 and n! = n * (n-1)! if n > 0.
         You are required to write a loop. Do not use a recursive routine.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer greater than or equal to 0: ");
        int n = in.nextInt();
        int product = 1;

        if(n == 0){

            System.out.println(n + "! = " + 1);

        }
        else
            for(int i = 1; i <= n; i++){

            product *= i;
            }
        System.out.println(n + "! = " + product);

    }

}
