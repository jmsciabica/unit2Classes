public class DistanceConverter
{ public static final double feetperyard = 3;
  public static final double inchesperfoot = 12;
   public static void main(String[] args)
   {
      double yards = 3.5;
     
      System.out.println(yards + " yards are " + yards * feetperyard + " feet.");
      System.out.println(yards + " yards are " + yards * feetperyard * inchesperfoot + " inches.");
   }
}