package oop;

public class Car extends Transport implements iLight{
    private boolean isOn;

    private String brand;
    public Engine engine = new Engine();

    public Car(){}



    public Car (float weight, int speed, String color, byte[] coord, String brand){
        super(weight, speed, color, coord);
        this.brand = brand;
        getBrand();
    }



    public void getBrand() {
        String info = "Brand: " + brand;
        System.out.println(info);

    }


    @Override
    public void move(int speed) {
        System.out.println("Наш объект двигается со скоросью " + speed);

    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;

    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");

    }
}