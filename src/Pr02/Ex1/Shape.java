package Pr02.Ex1;

public class Shape {
    private int sidesCount;
    private String name;

    public Shape(int sidesCount, String name) {
        this.sidesCount = sidesCount;
        this.name = name;
    }

    public void setSidesCount(int sidesCount) {
        this.sidesCount = sidesCount;
    }

    public int getSidesCount() {
        return sidesCount;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    void printShapeInfo() {
        System.out.println(sidesCount);
        System.out.println(name);
    }
}