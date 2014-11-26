import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass
{
   /** specifies the left side of the grass*/
   private int Xx;
   /** specifies the top of the grass*/
   private int Yy;
   /** specifies the width of the grass*/
   private int Ww;
   /** specifies the height of the grass*/
   private int Hh;
    
    /**
     * This is the grass constructor
     *
     * @param    x  Specifies the left side of the grass
     * 
     * @param    x  Specifies the top of the grass
   */
    public Grass(int x, int y, int w, int h)
    {
        Xx = x;
        Yy = y;
        Ww = w;
        Hh = h;
    }

    /**
     * An example of a method - Creates grass instances
     *
     * @param    Graphics2D g2 ... Graphics draw the background of grass
     * 
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double grass= new Rectangle2D.Double(Xx,Yy,Ww,Hh);
        
        Color greeen = new Color(41,112,24);
        
        g2.setColor(greeen);
        g2.fill(grass);
        
    }
}