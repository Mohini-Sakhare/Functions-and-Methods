
/*Function overloading using different data types
  
*/

public class funoverloding 
{
    public static int sum(int a, int b)
    {
        return a + b;
    }
    public static float sum(float a, float b, float c)
    {
        return a + b + c;
    }
    public static void main(String args[])
    {
        System.out.println("sum of integer:"+sum(3 , 4));
        System.out.println("sum of float:"+sum(3.5f, 4.5f, 5.5f));
    }
}
