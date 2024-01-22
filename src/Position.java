public class Position{
    private int hauteur = 300;
    public static final int HAUTEUR = 20;
    private int vitesse = 1;

    public int get(){
        return hauteur;
    }

    public void jump(){
        this.hauteur -= HAUTEUR;
        this.vitesse = 0;
    }

    public void move(){
        if(this.hauteur < 300 ){this.hauteur += vitesse;};
        if(vitesse < 20){ this.vitesse++;}
    }

}
