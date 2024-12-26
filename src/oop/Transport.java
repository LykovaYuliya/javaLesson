package oop;

public abstract class Transport {
    protected float weight;
    protected int speed;
    private String color;
    private byte[] coord;


    public abstract void move(int speed);

    public Transport(){}



    public Transport(float weight, int speed, String color, byte[] coord){
        System.out.println("Object create");
        setValues(weight, speed, color, coord);
        System.out.println(getValues());
    }

    public void setValues(float weight, int speed, String color, byte[] coord) {
        this.weight = weight;
        this.speed = speed;
        this.color = color;
        this.coord = coord;
    }

    public String getValues() {
        String info = "Weight: " + weight + "\n" + "Speed: " + speed + "\n" + "Color: " + color + "\n";
        String infoCord = "Coordinate: " + "\n";
        for (int i = 0; i < coord.length; i++) {
            infoCord += coord[i] + "\n";
        }
        return info + infoCord;
    }

 class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady){
            this.isReady = isReady;
        }

        public void info(){
            if (isReady) {
                System.out.println("Двигатель исправен");
            }
            else {
                System.out.println("Нет, он не работает, он проехал: " + km + " км");
            }
        }
}

}
