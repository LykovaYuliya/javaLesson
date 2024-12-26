package oop;

import oop.db.DB;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setLight(true);
        bmw.blinkLight();

//        Person ob1 = new Person();
//        Person ob2 = new Person();
//        Person ob3 = new Person();
//        Person ob4 = new Person();
//        ob4.getCount();




//        Person.count = 5;
//        System.out.println(Person.count);



//        DB db = new DB();
//        info();


//        Track bmw = new Track(11.0f, 200, "red", new byte[] {1, 1, 1}, true);
//        Car mazda = new Car(50.0f, 100, "blue", new byte[] {2, 2, 2}, "mazda");
//        mazda.engine.setValues(true, 100);
//        bmw.engine.setValues(false, 10000);
//        mazda.engine.info();
//        bmw.engine.info();
//
//        Car flyCar = new Car(50.0f, 100, "blue", new byte[] {2, 2, 2}, "mazda") {
//            @Override
//            public void move(int speed) {
//                super.move(speed);
//
//                this.engine.isReady(true);
//                System.out.println("Машина летит");
//            }
//        };
//
//        flyCar.move(560);


    }
    public static void info() {
        System.out.println("Hello");
    }

    public static void info(String word) {
        System.out.println(word + "!!!");
    }
}