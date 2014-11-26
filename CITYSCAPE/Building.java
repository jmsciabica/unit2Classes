import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building
{
   /** specifies the left side of the building*/
   private int Xx;
   /** specifies the top of the building*/
   private int Yy;
   /** specifies the width of the building*/
   private int Ww;
   /** specifies the height of the building*/
   private int Hh;
    
    /**
     * This is the building constructor
     *
     * @param    x  Specifies the left side of the building
     * 
     * @param    x  Specifies the top of the building
   */
    public Building(int x, int y, int w, int h)
    {
        Xx = x;
        Yy = y;
        Ww = w;
        Hh = h;
    }
    
    /**
     * Creates city building instances
     *
     * @param    g2 ... Graphics used to draw the houses/buildings
     * 
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double house = new Rectangle2D.Double(Xx,Yy,Ww,Hh);
        
        Color house1c = new Color(150,149,150);
        
        g2.setColor(house1c);
        g2.fill(house);
    }
}
        