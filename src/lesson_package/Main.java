package lesson_package;

public class Main {
    public static void main(String[] args) {
        byte num1 = 2;
        byte num2 = 4;
        print(num1);
        print(num2);
        int res = plus(num1, num2);
        print((byte) res);


    }
    public static void print(byte text) {
        System.out.println(text);
    }

    public static int plus(byte a, byte b) {
        int res = a + b;
        return res;
    }

}


