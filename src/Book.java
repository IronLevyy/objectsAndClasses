public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    public Book(String name, int yearPublication, Author author) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
}
