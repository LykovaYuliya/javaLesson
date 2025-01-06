package lesson_interface;

public class Main {
    public static void main(String[] args) {
//        Animals animals1 = new Animals(7);
//        animals1.showinfo();
        Info info1 = new Animals(7);
        outPutInfo(info1);

    }
    public static void outPutInfo(Info info){
        info.showinfo();
    }
}