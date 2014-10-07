import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building
{
   /** specifies the left side of the builing*/
   private int xLeft;
   /** specifies the top of the building*/
   private int yTop;
    
    /**
     * This is the building constructor
     *
     * @param    x  Specifies the left side of the building
     * 
     * @param    x  Specifies the top of the building
   */
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
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
        Rectangle2D.Double house = new Rectangle2D.Double(xLeft + 100, yTop + 100,200,475);
        
        Rectangle2D.Double house2 = new Rectangle2D.Double(xLeft + 250, yTop + 50,200,525);
        
        Rectangle2D.Double house3 = new Rectangle2D.Double(xLeft + 330, yTop + 120,200,455);
        
        Rectangle2D.Double house4= new Rectangle2D.Double(xLeft + 520, yTop + 60,200,515);
       
        Color house1c = new Color(150,149,150);
        Color house2c = new Color(164,159,159);
        Color house3c = new Color(164,159,159);
        
        g2.setColor(house1c);
        g2.fill(house);
        
        g2.setColor(house2c);
        g2.fill(house2);
        
        g2.setColor(house1c);
        g2.fill(house3);
        
        g2.setColor(house2c);
        g2.fill(house4);
        
        
    }
}
        