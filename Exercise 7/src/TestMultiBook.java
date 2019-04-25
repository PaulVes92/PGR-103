public class TestMultiBook {
    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Mario", "itsameM@rio", 'm');
        authors[1] = new Author("Luigi", "useless@brother", 'm');

        MultiBook dummyBook = new MultiBook("Java for Dummt", authors, 29.99, 100);

        System.out.println(dummyBook);
    }
}
