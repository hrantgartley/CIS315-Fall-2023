import java.util.Scanner;

public class AdditionApp {
    public static void main(String[] args) {
        System.out.println("Let's start the tutorial...");
        System.out.println(
                "You will be shown random numbers between 1 and 10 -- followed by the result of their addition");
        Scanner scan = new Scanner(System.in);
        int numOne, numTwo;
        char rollAgain;
        do {
            for (int i = 0; i < 4; i++) {
                numOne = (int) (Math.random() * 10) + 1;
                numTwo = (int) (Math.random() * 10) + 1;
                System.out.print("The numbers are: " + numOne + " " + numTwo);
                System.out.println();
                System.out.println("The total is: " + (numOne + numTwo));
                System.out.println();
            }
            System.out.print("Let's try again (y = yes): ");
            rollAgain = scan.next().charAt(0);
        } while (rollAgain == 'y');
        scan.close();

    }
}
