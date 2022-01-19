package homework6;

import java.util.Collection;

public class Books extends Library{
    private String name;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;
    private String publisher;


    public Books() {
    }

    public Books(String name, String author, int yearOfPublication, int numberOfPages, String publisher) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        publisher = publisher;
    }


    @Override
    public void printBooks() {
        System.out.printf("Книга: %s, автор - %s, год издания - %s, кол-во страниц - %s, издательство %s.\n", name, author, yearOfPublication, numberOfPages, publisher);
//        System.out.println("Самое толстое издение - "+ );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (yearOfPublication != books.yearOfPublication) return false;
        if (numberOfPages != books.numberOfPages) return false;
        if (name != null ? !name.equals(books.name) : books.name != null) return false;
        if (author != null ? !author.equals(books.author) : books.author != null) return false;
        return publisher != null ? publisher.equals(books.publisher) : books.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + yearOfPublication;
        result = 31 * result + numberOfPages;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                ", Publisher='" + publisher + '\'' +
                '}';
    }

}
