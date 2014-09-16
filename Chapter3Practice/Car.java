

/**
 * A car class tracks fuels capacity and consumptions based on efficienty
 * 
 * @author Jessie 
 * @version 12 September 2014
 */
public class Car
{
    /** fuel efficiency of the car measured in miles per gallon (mpg) */
    private double fuelEfficiency;
   
    /** amount of fuel in gas tank measured in gallons*/
    private double fuelInTank;
     
     
    /**
     * Consturctor that specifies the fuel efficiency of this car
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * The drive methos reduces the fuel in the tank based on the specified miles and the
     * efficiency of this car
     *    
     *
     * @pre        this method is never invoked with a value for miles that consumes more than
     *              the available gas in the tank
     * 
     * @param    miles      numb */
     
    public void drive(double miles)
    {
        double gallonsBurned = miles/this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }
    

    /**
     * Adds the specified amount of gas in gallons to the cars  tank.
     *
     * @pre     the specified amount of gas doesn't exceed the capacity of this car's tank.
     * 
     * @param   gallons     number of gallons of gas to add to this car's tank.
     */
    public void addGas(double gallons)
    {
        this.fuelInTank += gallons;
    }
    
    /**
     * Returns the number of gallons of gas remaining in the car's tank.
    
     * @return  the number of gallons of gas remaining in the car's tank.
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }
}
