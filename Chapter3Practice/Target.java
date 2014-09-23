import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;

    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double a = new Ellipse2D.Double(xLeft + 65, yTop + 65,200,200);
        Ellipse2D.Double b = new Ellipse2D.Double(xLeft + 80, yTop + 80,170,170);
        Ellipse2D.Double c = new Ellipse2D.Double(xLeft + 95, yTop + 95,140,140);
        Ellipse2D.Double d = new Ellipse2D.Double(xLeft + 110, yTop + 110,110,110);
        Ellipse2D.Double e = new Ellipse2D.Double(xLeft + 125, yTop + 125,80,80);
        Ellipse2D.Double f = new Ellipse2D.Double(xLeft + 140, yTop + 140,50,50);
        Ellipse2D.Double g = new Ellipse2D.Double(xLeft + 155, yTop + 155,20,20);
 
        g2.setColor(Color.BLACK);
        g2.fill(a);
        g2.setColor(Color.WHITE);
        g2.fill(b);
        g2.setColor(Color.BLACK);
        g2.fill(c);
        g2.setColor(Color.WHITE);
        g2.fill(d);
        g2.setColor(Color.BLACK);
        g2.fill(e);
        g2.setColor(Color.WHITE);
        g2.fill(f);
        g2.setColor(Color.BLACK);
        g2.fill(g);
        
        
        g2.draw(a);
        g2.draw(b);
        g2.draw(c);
        g2.draw(d);
        g2.draw(e);
        g2.draw(f);
        g2.draw(g);
        
        
        
    }

}
