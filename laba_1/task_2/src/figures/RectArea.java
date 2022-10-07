package figures;

public class RectArea {
    private int x;
    private int y;
    private int width;
    private int height;

    public RectArea(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public boolean isPointInRect(float ptX, float ptY) {
        return (ptX >= x && ptX <= x + width && ptY <= y && ptY >= y - height);
    }
}
