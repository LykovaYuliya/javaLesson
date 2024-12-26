package lesson_massive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[4];


    for (int i = 0; i < arr.length; i++) {
        System.out.print("Введите ваше число, ");
        int value = scan.nextInt();
        arr[i] = value;
    }

    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println("Минимальное число, " + min);


    }
}