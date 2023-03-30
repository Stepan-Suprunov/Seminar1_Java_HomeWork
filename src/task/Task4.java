package task;

import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void Calculator() {
        float result = 0;
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int first_num = scanner.nextInt();
        System.out.print("Введите действие: ");
        String action = scanner.next();
        System.out.print("Введите второе число: ");
        int second_num = scanner.nextInt();
        if (Objects.equals(action, "+")) {
            result = first_num + second_num;
        }
        if (Objects.equals(action, "-")) {
            result = first_num - second_num;
        }
        if (Objects.equals(action, "*")) {
            result = first_num * second_num;
        }
        if (Objects.equals(action, "/")) {
            result = (float) first_num / second_num;
        }
        System.out.print(result);
        System.out.println();
    }
}
