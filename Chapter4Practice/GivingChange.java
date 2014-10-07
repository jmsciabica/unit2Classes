import java.util.Scanner;

public class GivingChange
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount due: ");
        int due = s.nextInt();
        System.out.print("Enter the amount given: ");
        int recieved = s.nextInt();
        
        int pennies = recieved - due;
        
        int dollars = pennies / 100;
        pennies = pennies % 100;
        int quarters = pennies /25;
        pennies = pennies % 25;
        int dimes = pennies / 10;
        pennies = pennies % 10;
        
        
        System.out.print("Your change is: "+dollars+" dollars, "+quarters+" quarters, "+dimes+
        " dimes, "+"and "+pennies+ " pennies");
    }
}