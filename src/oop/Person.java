package oop;

public class Person {
    public static int count;

    public Person(){
        count++;
    }

    public void getCount() {
        System.out.println("Колличество " + count);
    }

}
