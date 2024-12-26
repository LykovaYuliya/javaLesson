package lesson_package.edi;

public class Main {
    public static void main(String[] args) {
        byte[] massiv1 = new byte[] {1, 2, 3, 4, 5};
        int summaMassiv1 = summa(massiv1);
        System.out.println("Сумма чисел в массиве равна: " + summaMassiv1);

    }

    public static int summa(byte[] podmena) {
        int num = 0;
        for (byte i = 0; i < podmena.length; i++) {
            num += podmena[i];
        }
        return num;
    }
}