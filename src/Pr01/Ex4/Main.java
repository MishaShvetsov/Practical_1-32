package Pr01.Ex4;

public class Main {
    public static void main(String[] args) {

        System.out.println(fuctorial(5));

    }
    public static long fuctorial(long n){
        if (n <= 1) {
            return 1;
        }
        return n*fuctorial(n-1);
    }
}