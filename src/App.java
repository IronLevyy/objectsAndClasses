public class App {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александер", "Пушкин");
        Author pushkinDouble = new Author("Александер", "Пушкин");
        Author Tolkin = new Author("Джон", "Толкин");
        Book ruslanAndLudmila = new Book("Руслан и Людмила", 1820, Pushkin);
        Book ruslanAndLudmilaDouble = new Book("Руслан и Людмила", 1820, Pushkin);
        Book lordOfTheRing = new Book("Властелин колец", 1977, Tolkin);
        lordOfTheRing.setYearPublication(1954);
        System.out.println(lordOfTheRing.toString());

        Author[] authorTests = new Author[]{Pushkin, pushkinDouble, Tolkin};
        Book[] bookTests = new Book[]{ruslanAndLudmila, ruslanAndLudmilaDouble, lordOfTheRing};
        tests(authorTests, bookTests);
    }

    public static void tests(Author[] authors, Book[] books) {
        if (authors[0].hashCode() == authors[1].hashCode()) {
            System.out.println("Хешкод равен и работает.");
        } else {
            System.out.println("Хешкод не равен и не работает");
        }

        if (books[0].hashCode() == books[1].hashCode()) {
            System.out.println("Хешкод равен и работает.");
        } else {
            System.out.println("Хешкод не равен и не работает.");
        }

        if (authors[0].hashCode() == authors[2].hashCode()) {
            System.out.println("Хешкод равен и не работает.");
        } else {
            System.out.println("Хешкод не равен и работает.");
        }

        if (books[0].hashCode() == books[2].hashCode()) {
            System.out.println("Хешкод равен и не работает.");
        } else {
            System.out.println("Хешкод не равен и работает.");
        }

        if (authors[0].equals(authors[1])) {
            System.out.println("Equals работает.");
        } else {
            System.out.println("Equals не работает.");
        }
        if (authors[0].equals(authors[2])) {
            System.out.println("Equals не работает.");
        } else {
            System.out.println("Equals работает.");
        }
        if (books[0].equals(books[1])) {
            System.out.println("Equals работает.");
        } else {
            System.out.println("Equals не работает.");
        }
        if (books[0].equals(books[2])) {
            System.out.println("Equals не работает.");
        } else {
            System.out.println("Equals работает.");
        }
    }
}
