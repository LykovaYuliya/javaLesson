package oop;

public class Track extends Transport {
    private boolean isLoaded;
    public Engine engine = new Engine();


    public Track(float weight, int speed, String color, byte[] coord, boolean isLoaded) {
        super(weight, speed, color, coord);
        this.isLoaded = isLoaded;
        getLoaded();
    }




    @Override
    public void move(int speed) {
        System.out.println("Наш объект двигается со скоросью " + speed);
    }


    public void getLoaded() {
        if (isLoaded) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Грузовик не загружен");
        }
    }
}
