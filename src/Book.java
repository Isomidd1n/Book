public class Book {
    private String name;
    private String[] author;
    private Long isbn;
    private int price;

    //Default constructor
    public Book() {
    }

    // All constructor
    public Book(String name, String[] author, Long isbn, int price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
