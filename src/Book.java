import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
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
        return this.publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = Math.min(publishYear, this.publishYear);
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    @Override
    public String toString() {
       return getAuthor().toString() + '\\' + getTitle() + '\\' + getPublishYear();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
