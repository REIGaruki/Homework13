import java.time.LocalDate;

public class Book {
    private String title;
    private Author author;
    public int publishYear;
    public Book(String title, Author author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = Math.min(publishYear, LocalDate.now().getYear());
    }
    public Book(String title, Author author) {
        this(title, author, LocalDate.now().getYear());
    }
    public int getPublishYear() {
        return publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
}
