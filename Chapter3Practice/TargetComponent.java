import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Write a description of class Target here.
 * 
 * @author (Jessie) 
 * @version (9/19/14)
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Target target1 = new Target(0,0);
        
        Target target2 = new Target(0,0);
        
        target1.draw(g2);
        target2.draw(g2);
    }
}
