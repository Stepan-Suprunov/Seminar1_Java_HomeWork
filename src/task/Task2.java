// Вычислить n!

package task;

import java.util.Scanner;

public class Task2 {
    public static void Factorial() {
        System.out.print("Введите число для вычисления факториала: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            System.out.printf("Факториал от " + n + " = " + result);
        } else if (n == 0) {
            System.out.print("Факториал от 0 = 1");
        } else {
            System.out.print("Введено отрицательное число");
        }
        System.out.println();
    }
}
