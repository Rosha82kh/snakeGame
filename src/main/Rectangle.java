package main;

public class Rectangle {
    private int posx;
    private int posy;
    public static final int rec_width =25;
    public static final int rec_height =25;

    public Rectangle(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }
    public boolean intersects(Rectangle r2){

        return this.posx==r2.getPosx() && this.posy==r2.getPosy();
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int increment ) {
        this.posx = posx+increment;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int increment) {
        this.posy = posy+increment;
    }
}
