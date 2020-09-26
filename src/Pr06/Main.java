package Pr06;

public class Main {
    public static void main(String[] args) {
        Movable p = new MovableRectangle(false, "red", 7, 2);
        System.out.println(p);
        p.move(4, -2);
        System.out.println(p);

    }
}
