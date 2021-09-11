/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1: ");
        Scanner input = new Scanner(System.in);
        String NotInt = input.nextLine();
        int OnePrice = Integer.parseInt(NotInt);

        System.out.println("Enter the quantity of item 1: ");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int OneQuantity = Integer.parseInt(NotInt);

        System.out.println("Enter the price of item 2: ");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int TwoPrice = Integer.parseInt(NotInt);

        System.out.println("Enter the quantity of item 2: ");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int TwoQuantity = Integer.parseInt(NotInt);

        System.out.println("Enter the price of item 3: ");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int ThreePrice = Integer.parseInt(NotInt);

        System.out.println("Enter the quantity of item 3: ");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int ThreeQuantity = Integer.parseInt(NotInt);

        float subtotal = (OnePrice * OneQuantity) + (TwoPrice * TwoQuantity) + (ThreePrice * ThreeQuantity);
        System.out.printf("Subtotal: $%.2f\n", subtotal);

        float tax = (float) (0.055 * subtotal);
        System.out.printf("Tax: $%.2f\n", tax);

        float total = tax + subtotal;
        System.out.printf("Total: $%.2f", total);
    }
}
