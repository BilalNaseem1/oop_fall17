package com.company;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args){
        /*
         1) Write a program that asks the user for an integer n >= 0,
         and displays the sum of the first n integers, i.e., 0+1+2+3+…+n.
          You are required to use   a loop. Do not use the formula n*(n+1)/2 or recursion.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer greater than 0: ");
        int n = in.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
