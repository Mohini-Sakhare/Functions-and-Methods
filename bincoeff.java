
//Factorial of Binomial Co-efficient - nCr = n! / r!(n-r)!

public class bincoeff 
{
  public static int bincoef(int n, int r)
  {
    int f=1;
         for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
    int fact_n = factorial(n);
    
    int fact_r = factorial(r);
    
    int fact_nmr = factorial(n-r);

    int bincoef =fact_n / (fact_r * fact_nmr);
    return bincoef;
  }
  
  public static void main(String args[])
  {
     System.out.println(factorial(5,2));
  }    
}
