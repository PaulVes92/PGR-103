public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price){

        // First constructor
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){

        // Second constructor
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return Author.getName();
    }

    public String getAuthorEmail(){
        return Author.getEmail();
    }

    public String getAuthorGender(){
        return Author.getGender();
    }

    public string toString(){
        return "Book[name=" + name + author.toString() + ", price= " ]"
    }
}
