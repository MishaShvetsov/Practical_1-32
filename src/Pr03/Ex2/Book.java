package Pr03.Ex2;

public class Book {
    private String name;
    private String author;
    private int publication_year;
    public Book(String name, String author, int publication_year) {
        this.name = name;
        this.author = author;
        this.publication_year = publication_year;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublicationYear(int publication_year){
        this.publication_year = publication_year;
    }


    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publication_year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publication_year=" + publication_year +
                '}';
    }
}
