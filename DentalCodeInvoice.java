import java.util.Scanner;

public class DentalCodeInvoice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your invoice: ");
        String choice = s.next();
        char finalChoice = choice.charAt(0);
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
}
