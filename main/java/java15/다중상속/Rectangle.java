package java15.다중상속;

public class Rectangle extends Shape implements Drawable {
    public int w, h;
    public void draw() {
        String s = "";
        s = String.format("(x,y)=(%d,%d) (w,h)=(%d,%d)",x,y,w,h);
        System.out.println(s);
    }

}
