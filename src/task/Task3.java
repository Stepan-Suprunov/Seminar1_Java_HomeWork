// Вывести все простые числа от 1 до 1000

package task;

public class Task3 {
    public static void PrimeNumber() {
        System.out.print("Все простые числа от 1 до 1000: ");
        int flag = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
            flag = 0;
        }
        System.out.println();
    }
}
