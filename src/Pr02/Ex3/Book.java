package Pr02.Ex3;

public class Book {
    private String name;
    private String writer;
    private int part;

    public Book(String name, String writer, int part) {
        this.name = name;
        this.writer = writer;
        this.part = part;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPart() {
        return part;
    }
    public void setPart(int part) {
        this.part = part;
    }
}