package Pr01.Ex1;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println(i);

        boolean isTrue = true;
        int a = 0;
        while (isTrue) {
            System.out.println(a);
            a += 2;
            if (a > 10)
                isTrue = false;
        }


        int b = 15;
        do {
            b--;
            System.out.println(b);
        } while (b > 10);
    }
}