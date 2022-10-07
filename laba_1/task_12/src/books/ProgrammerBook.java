package books;

public class ProgrammerBook extends Book
{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString()+ "(Language  " + language + ", level: " + level + ")";
    }

    @Override
    public int hashCode(){
        return super.hashCode() + language.hashCode();
    }

    @Override
    public boolean equals(Object sample){
        ProgrammerBook pBook = (ProgrammerBook)sample;
        return super.equals(pBook) && (pBook.level == level);
    }
}