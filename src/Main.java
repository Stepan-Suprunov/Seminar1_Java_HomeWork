// Домашнее задание к семинару №1 JAVA API Супрунов Степан

import task.Task1;
import task.Task2;
import task.Task3;
import task.Task4;

public class Main {
    public static void main(String[] args) {
        Task1.TriangularNumber();
        System.out.println();
        Task2.Factorial(); // не понятно, почему при вврде числа больше 15 ответ выдаётся неверный.
        System.out.println();
        Task3.PrimeNumber(); // изначально задал flag как boolean (true/false), но программа не работала. Почему так?
        System.out.println();
        Task4.Calculator(); // не понятно, почему если при делении написать result = first_num / second_num; результат
                            // округляется до целого.
    }
}
