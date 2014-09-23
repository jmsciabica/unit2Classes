import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

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
        Ellipse2D.Double a = new Ellipse2D.Double(xLeft + 10, yTop + 10,20,10);
        Ellipse2D.Double b = new Ellipse2D.Double(xLeft + 10, yTop + 10,30,10);
        Ellipse2D.Double c = new Ellipse2D.Double(xLeft + 10, yTop + 10,40,10);
        
        g2.draw(a);
        g2.draw(b);
        g2.draw(c);
        
        
    }

}
