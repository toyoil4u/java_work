package java12.exercise;

public class Rect {

    private int width;
    private int height;

    public Rect() {
    }

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2*(width + height);
    }
}
