// Вычислить n-ое треугольного число

package task;

import java.util.Scanner;

public class Task1 {
    public static void TriangularNumber() {
        System.out.print("Введите число для вычисления треугольного: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result += i;
            }
            System.out.printf("Треугольное число от " + n + " = " + result);
        } else {
            System.out.print("Введено не положительное число");
        }
        System.out.println();
    }
}
