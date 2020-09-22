package PracticalOne.Ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double variable = Math.random() * 100;
        String message = String.format("Random: %.2f",variable);
        System.out.println(message);

        Random random = new Random(1234);

        variable = random.nextDouble() * 100;
        message = String.format("Random: %.2f",variable);
        System.out.println(message);
        System.out.println(method(1, 5));
    }

    static int method(int a, int b) {
        for (int i = 0; i < 5; i++) {
            a += i;
        }
        return a + b;
    }
}