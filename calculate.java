public class calculate {
    public static void main(String[] args) {

    }

    public int GetSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public String ReturnData(String data) {
        Scanner scan = new Scanner(System.in);
        data = scan.nextLine();
        return data;
    }

    public int GetMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public int GetMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}

class subClassCalculate {
    public static void main(String[] args) {
        calculate cal = new calculate();
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(cal.GetSum(array));
        System.out.println(cal.ReturnData("Hello World"));
        System.out.println(cal.GetMax(array));
        System.out.println(cal.GetMin(array));
    }
}
