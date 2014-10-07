import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Write a description of class Backdrop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backdrop
{
   /** specifies the left side of the backdrop*/
   private int xLeft;
   /** specifies the top of the backdrop*/
   private int yTop;
    
    /**
     * This is the building constructor
     *
     * @param    x  Specifies the left side of the backdrop
     * 
     * @param    x  Specifies the top of the backdrop
   */
    public Backdrop(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * An example of a method - Creates sky and grass instances
     *
     * @param    Graphics2D g2 ... Graphics draw the background of grass and sky
     * 
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft + 65, yTop + 40,100,100);
        
        Rectangle2D.Double background = new Rectangle2D.Double(xLeft + 0, yTop + -200,5000,5000);
        
        Rectangle2D.Double grass= new Rectangle2D.Double(xLeft + 0, yTop + 500,1000,1000);
        
        Color navy = new Color(14,74,152);
        Color greeen = new Color(41,112,24);
        
        g2.setColor(navy);
        g2.fill(background);
        
        g2.setColor(greeen);
        g2.fill(grass);
        
    }
}