package tasks;

import java.util.Scanner;

public class GradeToText {
    public static void gradeToText(int grade) {
        switch (grade) {
            case 2:
                System.out.println("Плохо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Введите оценку от 2 до 5");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку от 2 до 5: ");
        int grade = scanner.nextInt();
        gradeToText(grade);
        scanner.close();
    }
}
