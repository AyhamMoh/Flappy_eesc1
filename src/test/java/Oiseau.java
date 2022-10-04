import java.awt.*;

public class Oiseau extends Rectangle{

    protected int vitesseVertical ;

  @Override
  public void dessiner(Graphics2D dessin) {}

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }

    public void sauter (){

    }

}
