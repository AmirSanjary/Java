import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        int count = 0;
        while (count < 10) {
            System.out.print("لطفاً یک اسم وارد کنید: ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) { 
                names[count] = name;
                count++;
            } else {
                System.out.println("لطفاً یک اسم معتبر وارد کنید.");
            }
        }

        System.out.println("\nتعداد کاراکترهای هر اسم:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + names[i].length() + " کاراکتر");
        }

        scanner.close();
    }
}