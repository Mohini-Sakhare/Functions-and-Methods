
//Binary to Decimal conversion

public class bintodec 
{
 public static void bindec(int binum)
 {
    int mynum=binum;
    int pow=0;
    int decnum=0;

    while(binum>0)
    {
        int lastdigit = binum % 10;
        decnum = decnum + (lastdigit * (int)Math.pow(2 , pow));
                                                 //base and power 2 raise 1,2,3..   
        pow++;
        binum = binum / 10;                                         
    
    } 
    System.out.println("Decimal of " +mynum+ " = " +decnum);                                            
 }
 public static void main(String args[])
 {
    bindec(1010010);
 }    
}
