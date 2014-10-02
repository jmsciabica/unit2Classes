import java.util.Scanner;

public class StringParsing2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER BETWEEN 1,000 AND 999,999.(No commas): ");
        String num = s.next();
        String end = num.substring(num.length()-3);
        String begin = num.substring(0,num.length()-3);
        System.out.println(begin+","+end);
        
    }
}