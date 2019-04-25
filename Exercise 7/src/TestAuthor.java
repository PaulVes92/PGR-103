public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Mario", "somwhere@anywhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("mmm@mmm.com");
        System.out.println("Name is " + ahTeck.getName());
        System.out.println("email is " + ahTeck.getEmail());
        System.out.println("gender is " + ahTeck.getGender());

    }
}
