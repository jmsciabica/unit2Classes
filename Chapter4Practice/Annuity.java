

public class Annuity
{
    public static void main(String[] args)
    {
       double i = .08;
       double n = 20;
       double PMT = 10000;
       double PV = PMT * (((Math.pow((1 + i),(n - 1)) - 1) / i ) / Math.pow((1 + i),(n - 1)) + 1);
       System.out.println(PV);
    }
}
