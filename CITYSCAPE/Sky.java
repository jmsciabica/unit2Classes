import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
   /** specifies the left side of the sky*/
   private int Xx;
   /** specifies the top of the sky*/
   private int Yy;
   /** specifies the width of the sky*/
   private int Ww;
   /** specifies the height of the sky*/
   private int Hh;
    
    /**
     * This is the sky constructor
     *
     * @param    x  Specifies the left side of the sky
     * 
     * @param    x  Specifies the top of the sky
   */
    public Sky(int x, int y, int w, int h)
    {
        Xx = x;
        Yy = y;
        Ww = w;
        Hh = h;
    }

    /**
     * An example of a method - Creates sky instances
     *
     * @param    Graphics2D g2 ... Graphics draw the background of sky
     * 
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky = new Rectangle2D.Double(Xx,Yy,Ww,Hh);
        
        Color navy = new Color(14,74,152);
        Color greeen = new Color(41,112,24);
        
        g2.setColor(navy);
        g2.fill(sky);
        
    }
}