package com.company;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int d1;
        int d2;
        int sum;
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        String s9 = "";
        String s10 = "";
        String s11 = "";
        String s12 = "";
        String s13 = "";

        System.out.println("Enter the number of times the dice must roll: ");
        int turns = in.nextInt();
        for(int i = 1; i <= turns; i++){

            d1 = 1 + (int)(Math.random() * 7);
            d2 = 1 + (int)(Math.random() * 7);
            sum = d1 + d2;

            if(sum == 2){
                s2 += "" + "*";
            }
            else if(sum == 3){
                s3 += "" + "*";
            }
            else if(sum == 4){
                s4 += "" + "*";
            }
            else if(sum == 5){
                s5 += "" + "*";
            }
            else if(sum == 6){
                s6 += "" + "*";
            }
            else if(sum == 7){
                s7 += "" + "*";
            }
            else if(sum == 8){
                s8 += "" + "*";
            }
            else if(sum == 9){
                s9 += "" + "*";
            }
            else if(sum == 10){
                s10 += "" + "*";
            }
            else if(sum == 11){
                s11 += "" + "*";
            }
            else if(sum == 12){
                s12 += "" + "*";
            }



        }
        System.out.println("Sum 2 = " + s2);
        System.out.println("Sum 3 = " + s3);
        System.out.println("Sum 4 = " + s4);
        System.out.println("Sum 5 = " + s5);
        System.out.println("Sum 6 = " + s6);
        System.out.println("Sum 7 = " + s7);
        System.out.println("Sum 8 = " + s8);
        System.out.println("Sum 9 = " + s9);
        System.out.println("Sum 10 = " + s10);
        System.out.println("Sum 11 = " + s11);
        System.out.println("Sum 12 = " + s12);


    }
}
