import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {

        if (publicationYear < 1) {
            throw new IllegalArgumentException("Год не может быть отрицательным или равным 0");
        }
        this.publicationYear = publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        return book.name.equals(this.name) && book.author.equals(this.author) && book.publicationYear == this.publicationYear;
    }

    @Override
    public String toString() {
        return "Название " + name + ", автор " + author.toString() + ", год публикации " + publicationYear;
    }
}
