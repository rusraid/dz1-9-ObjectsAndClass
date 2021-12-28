package homework1;

import java.util.Objects;

public class Book {

    private final Author author;
    private final String publisherName;
    private int publishingYear;

    public Book(Author author, String name, int publishingYear) {
        this.author = author;
        this.publisherName = name;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisherName() {
        return publisherName;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(author, book.author) && Objects.equals(publisherName, book.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, publisherName, publishingYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", publisherName='" + publisherName + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}

