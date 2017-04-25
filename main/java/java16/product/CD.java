package java16.product;

public class CD extends Product {
    private String album;
    private String singer;

    public CD() {
        super();
    }

    public CD(int id, String info, String producer, int price, String album, String singer) {
        super(id, info, producer, price);
        this.album = album;
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
