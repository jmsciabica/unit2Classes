import java.util.Scanner;
import java.util.ArrayList;
public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER BETWEEN 1,000 AND 999,999.(With commas included): ");
        String num = s.next();
        String index = num.replace(",","");
        System.out.println(index);
        
    }
}
