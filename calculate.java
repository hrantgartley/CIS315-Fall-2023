import java.util.Scanner;

public class calculate {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(GetSum(array));
        System.out.println(ReturnData("Hello World"));
        System.out.println(GetMax(array));
        System.out.println(GetMin(array));

    }

    public static int GetSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String ReturnData(String data) {
        data = scan.nextLine();
        return data;
    }

    public static int GetMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int GetMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

}
