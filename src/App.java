public class App {
    public static void main(String[] args) {
        Author Pushkin = new Author("Aleksander", "Pushkin");
        Author Tolkin = new Author("John", "Tolkin");
        Book ruslanAndLudmila = new Book("Руслан и Людмила", 1820, Pushkin);
        Book lordOfTheRing = new Book("Властелин колец", 1977, Tolkin);
        lordOfTheRing.setYearPublication(1954);
    }
}
