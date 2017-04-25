package java16.product;

public class ConversationBook extends Book {
    private String language;

    public ConversationBook() {
        super();
    }

    public ConversationBook(int id, String info, String producer, int price, int ISBN, String author, String title, String language) {
        super(id, info, producer, price, ISBN, author, title);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
