import java.util.Scanner;

/**
 * DiscountCheckApp
 */
/*
 * Grant Hartley
 * CIS 315
 * Lab 4
 * 2023-09-20
 */
public class DiscountCheckApp {
    public static void main(String[] args) {
        final double DISCOUNT = .1;
        double itemCost = 0.0;
        int count = 0;
        Scanner s = new Scanner(System.in);
        double discountAmount = 0.0;
        while (itemCost != -1) {
            System.out.println();
            System.out.print("Enter the sales price (or -1 to end)$: ");
            itemCost = s.nextDouble();
            if (itemCost == -1) {
                break;
            }
            discountAmount = itemCost * DISCOUNT;
            System.out.printf("The discount amount is $%.2f", discountAmount, "\n");
            count++;
        }
        System.out.println("You have checked the discount amount for " + count + " items.");
        s.close();
    }
}
