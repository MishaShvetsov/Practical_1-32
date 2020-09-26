package Pr02.Ex3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("'War and Peace'" , "Lev Nikolaevich Tolstoy", 4 );
        System.out.println("Book title: " + book.getName()  + "\nBook author: " + book.getWriter() + "\nNumber of parts: " + book.getPart());
    }
}