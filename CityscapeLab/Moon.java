import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Moon
{
    private int xLeft;
    private int yTop;

    public Moon(int x, int y)
    {
        xLeft = x;
        yTop = y;
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
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft + 65, yTop + 40,100,100);
        
        Color mooon = new Color(255,255,204);
        
        g2.setColor(mooon);
        g2.fill(moon);
        
    }
}
        