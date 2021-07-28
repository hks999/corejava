/**
 * Dragon curves. Dragon curvesWrite a program Dragon.java to print the instructions for drawing the dragon curves of order 0 through 5.
 * The instructions are strings of the characters F, L, and R, where F means "draw line while moving 1 unit forward", L means "turn left",
 * and R means turn right. A dragon curve of order n is formed when you fold a strip of paper in half n times,
 * then unfold to right angles. The key to solving this problem is to note that a curve of order n is a curve of order n−1 followed by
 * an L followed by a curve of order n−1 traversed in reverse order, and then to figure out a similar description of the reverse curve.
 */

        import java.awt.Color;
        import java.awt.Graphics;
        import java.util.*;
        import javax.swing.JFrame;

public class DragonCurve extends JFrame {

    private List<Integer> turns;
    private double startingAngle, side;

    public DragonCurve(int iter) {
        super("Dragon Curve");
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        turns = getSequence(iter);
        startingAngle = -iter * (Math.PI / 4);
        side = 400 / Math.pow(2, iter / 2.);
    }

    public List<Integer> getSequence(int iterations) {
        List<Integer> turnSequence = new ArrayList<Integer>();
        for (int i = 0; i < iterations; i++) {
            List<Integer> copy = new ArrayList<Integer>(turnSequence);
            Collections.reverse(copy);
            turnSequence.add(1);
            for (Integer turn : copy) {
                turnSequence.add(-turn);
            }
        }
        return turnSequence;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        double angle = startingAngle;
        int x1 = 230, y1 = 350;
        int x2 = x1 + (int) (Math.cos(angle) * side);
        int y2 = y1 + (int) (Math.sin(angle) * side);
        g.drawLine(x1, y1, x2, y2);
        x1 = x2;
        y1 = y2;
        for (Integer turn : turns) {
            angle += turn * (Math.PI / 2);
            x2 = x1 + (int) (Math.cos(angle) * side);
            y2 = y1 + (int) (Math.sin(angle) * side);
            g.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }

    public static void main(String[] args) {
        new DragonCurve(14).setVisible(true);
    }
}
