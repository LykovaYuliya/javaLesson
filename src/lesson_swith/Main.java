package lesson_swith;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scan.nextInt();

        switch (age) {
            case 0:
                System.out.println("Вы родитись");
                break;
            case 5:
                System.out.println("Вы ребенок");
                break;
            case 13:
                System.out.println("Вы подросток");
                break;
            default:
            System.out.println("Нет значения");
        }
    }
}