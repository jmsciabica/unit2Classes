import java.util.Scanner;
public class PhoneNumber
{ public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the phone number: ");
        String num = s.next();
        String begin = num.substring(0,num.length()-7);
        String middle = num.substring(3,num.length()-4);
        String end = num.substring(6,num.length());
        System.out.print("("+begin+")"+middle+"-"+end);
    }
}
