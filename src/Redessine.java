public class Redessine extends Thread{
    private Affichage monAffichage;
    public static final int DELAY = 50;

    public Redessine(Affichage monAffichage){
        this.monAffichage = monAffichage;
    }

    @Override
    public void run() {
        while(true) {
            monAffichage.repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
