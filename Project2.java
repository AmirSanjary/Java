import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("لطفاً 10 عدد وارد کنید:");
        for (int i = 0; i < 10; i++) {
            System.out.print("عدد " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("\nاعداد بالای 5700:");
        for (double number : numbers) {
            if (number > 5700) {
                System.out.println(number);
            }
        }

        System.out.println("\nاعداد بالای 5700 پس از کم کردن 5 درصد:");
        for (double number : numbers) {
            if (number > 5700) {
                double reducedNumber = number - (number * 0.05);
                System.out.println(reducedNumber);
            }
        }

        scanner.close(); 
    }
}