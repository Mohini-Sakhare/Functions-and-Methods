
//Decimal to Binary Conversion

public class dectobin 
{
    public static void decbin(int decnum)
    {
        int mynum=decnum;
        int binum=0;
        int pow=0;

        while(decnum>0)
        {
            int rem= decnum % 2;
            binum=binum+(rem*(int)Math.pow(10,pow));

            pow++;
            decnum=decnum/2;
        }
        System.out.println("Binary of "+mynum+ "=" +binum);
    }
  public static void main(String args[])
  {
    decbin(25);

  }    
}
