/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex09
{
    public static void main( String[] args )
    {
        Scanner squareFeet = new Scanner(System.in);
        float sqFeet = squareFeet.nextInt();
        float gallon = sqFeet / 350;
        System.out.println("You will need to purchase " + (int) Math.ceil(gallon) +  " gallons of paint to cover " + (int) sqFeet + " square feet.");
    }
}
