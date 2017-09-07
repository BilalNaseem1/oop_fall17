package com.company;
import java.util.Scanner;

public class Modulo {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
        3) Write a program that asks the user for an integer n > 1, and then displays a two-dimensional multiplication table modulo n.
        The table will begin with 1 * 1 mod n and will finish at 12 * 12 mod n.
        You are required to use nested loops. Use the % operator to compute the remainder. The table should appear nicely formatted.

Suppose that a user enters the value 3 for n. Your program will display the following table:

     1  2  3  4  ……      12
 1   1  2  0  1          0
 2   2  1  0  2  ……      0
 :
 :
 12  0  0  0 ……          0


         */

        System.out.println("Enter the value of n > 1: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        for(int i = 1; i <= n; i++){

            System.out.print(i + " ");
            for(int j = 1; j <= n; j++){

                System.out.print((i*j)%3 + " ");
            }
            System.out.println();

        }
    }
}
