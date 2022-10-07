package books;

import java.util.Comparator;

public class BooksComparator
{
    public static Comparator<Book> byAuthor = (book1, book2) -> {
        return book1.author.compareToIgnoreCase(book2.author);
    };

    public static Comparator<Book> byTitle = (book1, book2) -> {
        return book1.title.compareToIgnoreCase(book2.title);
    };

    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);

    public static Comparator<Book> byTitleThenAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThenTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThenTitleThanPrice = byAuthor
            .thenComparing(byTitle).thenComparing(byPrice);
}