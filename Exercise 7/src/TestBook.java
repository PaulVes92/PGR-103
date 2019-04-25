public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Mario", "itsameM@ario.com", 'm');
        System.out.println(ahTeck);
        Book coolBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(coolBook);

        coolBook.setPrice(100.000);
        coolBook.setQty(1);
        System.out.println("name is: " + coolBook.getName());
        System.out.println("price is: " + coolBook.getPrice());
        System.out.println("qty is: " + coolBook.getQty());
        System.out.println("Author is: " + coolBook.getAuthor());
        System.out.println("Author's name is: " + coolBook.getAuthor().getName());
        System.out.println("Author's email is: " + coolBook.getAuthor().getEmail());

        Book coolerBook = new Book("more Java",
                new Author("Luigi", "useless@brother", 'm'), 29.95);
        System.out.println(coolerBook);

        System.out.println(coolBook.getAuthor().getName() + " " + coolBook.getAuthor().getEmail());
        System.out.println(coolBook.getAuthorName() + " " + coolBook.getAuthorEmail() + " " + coolBook.getAuthorGender());
    }
}
