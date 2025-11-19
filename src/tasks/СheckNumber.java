package tasks;

import java.util.Scanner;

public class СheckNumber {

    public static void checkNumber(int x) {
        if (x > 0) {
            System.out.println("положительно");
        } else if (x < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        checkNumber(x);

    }

}
