package lesson_if;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число,");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число, ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Введите функцию, ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
            res = num1 + num2;
            System.out.println("Результат суммы, " + res);
            break;

            case "-":
            res = num1 - num2;
            System.out.println("Результат вычитания, " + res);
            break;

            case "*":
            res = num1 * num2;
            System.out.println("Результат умножения, " + res);
            break;

            case "/":
            if (num2 == 0) {
                System.out.println("Делить на ноль нельяза");
            }
            else {
                res = num1 / num2;
                System.out.println("Результат деления, " + res);

            }
            break;

            default:
                System.out.println("Введен не знак функции");
        }
    }
}