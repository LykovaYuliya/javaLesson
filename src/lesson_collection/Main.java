package lesson_collection;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(15);
        number.add(25);
        number.add(20);
        number.remove(1);
        number.add(1,20);


        for (Integer el: number) {
            System.out.println(el);
        }
    }
}