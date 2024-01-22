import javax.swing.*;
/** La classe principale de ce projet */
public class Main {
    /** La méthode de lancement du programme */
    public static void main(String [] args) {
        JFrame maFenetre = new JFrame("Exercice 1");
        Position pos = new Position();
        Affichage a = new Affichage(pos);
        Redessine r = new Redessine(a);
        Descendre d = new Descendre(pos);
        maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.addMouseListener(new ReactionClic(pos));
        maFenetre.setLocationRelativeTo(null);
        maFenetre.add(a);
        r.start();
        d.start();
        maFenetre.pack();
        maFenetre.setVisible(true);

    }
}
