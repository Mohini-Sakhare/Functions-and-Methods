

//Factorial of a number
import java.util.*;

public class fact0rial 
{
    public static int factorial(int n)
    {
        
        int f=1;

        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
        return f; //factorial of n
    }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();

    int fact=factorial(n);
     System.out.println("factorial of a number:" +fact);
  }      
}
