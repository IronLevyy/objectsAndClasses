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

    public String toString() {
        return "Название: " + name + " Автор: " + author.toString() + " Год выпуска: " + yearPublication;
    }

    public boolean equals(Book comparable) {
        if (this == comparable) {
            return true;
        }
        if (this.getClass() != comparable.getClass() || comparable == null) {
            return false;
        }
        return this.name.equals(comparable.name) && this.author.equals(comparable.author) && this.yearPublication == comparable.yearPublication;
    }

    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearPublication;
        return result;
    }
}
