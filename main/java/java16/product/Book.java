package java16.product;

public class Book extends Product {
    private int ISBN;
    private String author;
    private String title;

    public Book() {
        super();
    }

    public Book(int id, String info, String producer, int price, int ISBN, String author, String title) {
        super(id, info, producer, price);
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
