import java.awt.*;

public abstract class Sprite {

    protected int x;
    protected int y;
    protected Color coleur;



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColeur() {
        return coleur;
    }

    public void setColeur(Color coleur) {
        this.coleur = coleur;
    }

    public abstract void dessiner(Graphics2D dessin);



}
