
/*
Name: Grant Hartley
Student ID: 678984
Email: ghartley@una.edu
Course Information: CS 315
Program Source File Name: Income.java
Programming Assignment: Project 2
Program Description: a program that will calculate the net income, profit margin, current rotio based on user input
References:
Due Date: 11/2/2023
In keeping with the honor code policies of the University of University of North Alabama, the
School of Business, and the Department of Computer Science, I affirm that I have neither
given nor received on this programming assignment. This assignment
represents my individual, original effort.
*/
import java.util.Scanner;

public class Income {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose what you would like to calculate.");
        menu();
        int choice = getChoice();
        do {
            processChoice(choice);
            menu();
            choice = getChoice();
        } while (choice != 5);
        System.out.println("Goodbye");
    }

    public static int getChoice() {
        System.out.print("Enter your choice: ");
        int choice;
        choice = s.nextInt();
        return choice;
    }

    public static void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter the revenue: ");
                double revenue = s.nextDouble();
                System.out.print("Enter the expense: ");
                double expense = s.nextDouble();
                double netIncome = netIncome(revenue, expense);
                System.out.println("The net income is: " + netIncome);
                break;
            case 2:
                System.out.print("Enter the net income: ");
                double netIncome1 = s.nextDouble();
                System.out.print("Enter the revenue: ");
                double revenue1 = s.nextDouble();
                double profitMargin = profitMargin(netIncome1, revenue1);
                System.out.println("The profit margin is: " + profitMargin);
                break;
            case 3:
                System.out.print("Enter the current assets: ");
                double currentAssets = s.nextDouble();
                System.out.print("Enter the current liabilities: ");
                double currentLiabilities = s.nextDouble();
                double currentRatio = currentRatio(currentAssets, currentLiabilities);
                System.out.println("The current ratio is: " + currentRatio);
                break;
            case 4:
                System.out.print("Enter the beginning inventory: ");
                double beginningInventory = s.nextDouble();
                System.out.print("Purchases during the period");
                double purchases = s.nextDouble();
                System.out.print("Enter the ending inventory: ");
                double endingInventory = s.nextDouble();
                double costOfGoodsSold = costOfGoodsSold(beginningInventory, endingInventory, purchases);
                System.out.println("The cost of goods sold is: " + costOfGoodsSold);
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
        }

    }

    private static double costOfGoodsSold(double beginningInventory, double endingInventory, double costOfGoodsSold) {
        return (beginningInventory + costOfGoodsSold) - endingInventory;

    }

    public static double netIncome(double revenue, double expense) {
        double netIncome = revenue - expense;
        return netIncome;
    }

    public static void menu() {
        System.out.println("1. Find the Net Income");
        System.out.println("2. Find the Profit Margin");
        System.out.println("3. Find the Current Ratio");
        System.out.println("4. Find the Cost of Goods Sold");
        System.out.println("5. Exit the Program");
    }

    public static double profitMargin(double netIncome, double revenue) {
        double profitMargin = netIncome / revenue;
        return profitMargin;
    }

    public static double currentRatio(double currentAssets, double currentLiabilities) {
        double currentRatio = currentAssets / currentLiabilities;
        return currentRatio;
    }
}
