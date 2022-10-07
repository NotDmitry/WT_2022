package books;

import java.util.Objects;

public class Book implements Comparable<Book>
{
    public String title ;
    public String author;
    public int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    protected Book(Book sample) {
        title = sample.title;
        author = sample.author;
        price = sample.price;
    }

    @Override
    public String toString(){
        return title + " - " + author + ". Price: " + price;
    }

    @Override
    public int hashCode(){
        return 27 + title.hashCode() - author.hashCode();
    }

    @Override
    public boolean equals(Object sample){
        if (sample instanceof Book book) {
            return Objects.equals(book.title, title) &&
                    Objects.equals(book.author, author);
        }
        else
            return false;
    }

    @Override
    public Book clone() {
        return new Book(this);
    }

    @Override
    public int compareTo(Book sample) {
        return  Integer.compare(this.isbn, sample.isbn);
    }
}
