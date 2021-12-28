package homework1;

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
}

