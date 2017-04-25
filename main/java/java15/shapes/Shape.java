package java15.shapes;

abstract class Shape {
    int x, y;
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
}
