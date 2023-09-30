import java.util.Scanner;

public class DentalCodeInvoice {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your invoice: ");
        char finalChoice = getChoice();
        switch (finalChoice) {
            case 'A':
                System.out.println("Dental Exam");
                break;
            case 'B':
                System.out.println("X-Ray");
                break;
            case 'C':
                System.out.println("Refferal to speicalist");
        }
        s.close();
    }

    public static char getChoice() {
        System.out.print("Enter your invoice: ");
        String choice = s.next();
        char finalChoice = choice.charAt(0);
        return finalChoice;
    }
}
