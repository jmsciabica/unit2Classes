import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Moon
{
    /** specifies the left side of the moon*/
   private int Xx;
   /** specifies the top of the moon*/
   private int Yy;
   /** specifies the width of the moon*/
   private int Ww;
   /**
     * This is the building constructor
     *
     * @param    x  Specifies the left side of the moon
     * 
     * @param    x  Specifies the top of the moon
   */
    public Moon(int x, int y, int w)
    {
        Xx = x;
        Yy = y;
        Ww = w;
    }
    
    /**
     * An example of a method - Creates city building instances
     *
     * @param    Graphics2D g2 ... Graphics used to draw the moon
     * 
     * @return    void
     */
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(Xx,Yy,Ww,Ww);
        
        Color mooon = new Color(255,255,204);
        
        g2.setColor(mooon);
        g2.fill(moon);
        
    }
}
        