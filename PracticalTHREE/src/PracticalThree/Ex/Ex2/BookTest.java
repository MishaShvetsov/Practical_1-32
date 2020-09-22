package PracticalThree.Ex.Ex2;

public class BookTest {
    public static void main(String[] args) {
        String name = args[0];
        String author = args[2];
        double a = Double.parseDouble(args[0]);
        int publication_date = (int) a;

        Book book1 = new Book("Aaa", "Bbb", 1914);
        Book book2 = new Book("Ccc", "Ddd", 1918);
        Book book3 = new Book(name, author, publication_date);

        System.out.println(book1.toString());

        System.out.println(book2.getPublicationYear());

        System.out.println(book3.getAuthor());

    }
}