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

    @Override
    public String toString() {
        return "상품번호>> " + getId() + "\n상품설명>> " + getInfo() + "\n생산자>> " + getProducer()
                + "\n가격정보>> " + getPrice() + "\n언어>> " + language
                + "\n---------------------------";
    }
}
