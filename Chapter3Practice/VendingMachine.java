

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{   private int cans;
    private int tokens;
    public VendingMachine(int cansIn, int tokensIn)
    {
        this.cans = cansIn;
        this.tokens = tokensIn;
    }
    public void insertToken(int tokensInto) 
    {
        this.tokens += tokensInto;
        this.cans -= tokensInto;
    }
    public void fillUp(int cans)
    {
        this.cans += cans;
    }
    public int getCans()
    {
        return this.cans;
    }
    public int getTokens()
    {
        return this.tokens;
    }
  
}
