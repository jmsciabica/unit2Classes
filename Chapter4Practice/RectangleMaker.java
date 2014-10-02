import java.util.Scanner;
public class RectangleMaker
{
    public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print("Insert Length: ");
       int length = s.nextInt();
       System.out.print("Insert Width: ");
       int width = s.nextInt();
       int perimeter = width + length;
       int area = length * width;
       System.out.println("Perimeter: "+perimeter);
       System.out.print("Area: "+area);
   }
}
