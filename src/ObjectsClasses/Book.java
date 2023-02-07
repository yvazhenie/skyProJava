package ObjectsClasses;

public class Book {
    private String name;

    private int dateOfWriting;

    private Author author;


    Book() {

    }

    public Book(String name, int dateOfWriting, Author author) {
        this.name = name;
        this.dateOfWriting = dateOfWriting;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfWriting() {
        return dateOfWriting;
    }

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название книги: " + name +
                ". Год издания: " + dateOfWriting +
                ". Авттор книги: " + author;
    }
}
