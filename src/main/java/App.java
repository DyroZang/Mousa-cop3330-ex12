/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int principal = Integer.parseInt(input.nextLine());

        System.out.println("Enter the rate of interest: ");
        double interest = Double.parseDouble(input.nextLine());

        System.out.println("Enter the amount of years: ");
        int years = Integer.parseInt(input.nextLine());

        double amount = principal*(1 + ((interest/100)*years));

        System.out.format("After %d years at %.1f" + "%%" + ", the investment will be worth $%.0f", years, interest, amount );
    }
}