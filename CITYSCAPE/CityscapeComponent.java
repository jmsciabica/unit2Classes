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
     
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Sky sky = new Sky(0,0,5000,5000);
        
        Grass grass = new Grass(0,500,1000,1000);
       
        Moon moon= new Moon(25,25,100);
        
        Building house = new Building(100,100,150,500);
        
        Building2 house2 = new Building2(250,50,200,550);
        
        Building3 house3 = new Building3(400,120,200,480);
        
        Building4 house4 = new Building4(520,60,200,540);
        
        sky.draw(g2);
        grass.draw(g2);
        moon.draw(g2);
        house.draw(g2);
        house2.draw(g2);
        house4.draw(g2);
        house3.draw(g2);
        
    }
}
