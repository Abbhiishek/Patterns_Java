package com.patterns;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey abhishek i am ready to work with cool patterns :)");


        {
            // write your code he{
            //i for rows and j for columns
            //row denotes the number of rows you want to print
            int i, j, row = 6;
            //outer loop for rows
            for (i = 1; i <= row; i++) {
                //inner loop for columns
                for (j = 1; j <= i; j++) {
                    //prints stars
                    System.out.print("* ");
                }
                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }


        {
                 //i for rows and j for columns
               //row denotes the number of rows you want to print
            int i, j, row = 6;
              //Outer loop work for rows
            for (i = 0; i < row; i++) {
              //inner loop work for space
                for (j = 2 * (row - i); j >= 0; j--) {
              //prints space between two stars
                    System.out.print(" ");
                }
                      //inner loop for columns
                for (j = 0; j <= i; j++) {
                     //prints star
                    System.out.print("* ");
                }
                     //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }
}
