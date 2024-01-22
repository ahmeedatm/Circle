import javax.swing.*;
import java.awt.*;

public class Affichage extends JPanel {

    public static final int H = 400;
    public static final int W = 400;
    public Position pos;

    public Affichage(Position p){
        this.setPreferredSize(new Dimension(H, W));
        this.pos = p;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(150, pos.get(), 20,100);
    }
}
