import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building2
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
    public Building2(int x, int y, int w, int h)
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
        Rectangle2D.Double house2 = new Rectangle2D.Double(Xx,Yy,Ww,Hh);
       
        Color house2c = new Color(164,159,159);
        
        g2.setColor(house2c);
        
        g2.fill(house2);
        
        
    }
}
        