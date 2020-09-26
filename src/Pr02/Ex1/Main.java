package Pr02.Ex1;

public class Main {
        public static void main(String[] args) {
            Shape shape = new Shape(27, "Misha");
            int count = shape.getSidesCount();
            System.out.println(count);
            shape.setSidesCount(54);
            System.out.println(shape.getSidesCount());
            System.out.println(shape);
        }
    }