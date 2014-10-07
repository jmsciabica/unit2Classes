import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Jessie Sciabica
 * @version 7 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - creates the background,grass,moon, and house instances
     *
     * @param   Graphics g draws the background,grass,moon, and house instances
     * 
     * @return    void
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Backdrop background = new Backdrop(0,0);
        
        Backdrop grass = new Backdrop(0,0);
       
        Moon moon= new Moon(0,0);
        
        Building house = new Building(0,0);
        
        background.draw(g2);
        grass.draw(g2);
        moon.draw(g2);
        house.draw(g2);
        
        
        
    }
}
