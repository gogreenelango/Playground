import java.util.Scanner;
class Main
{
  public static int pow(int m, int n)
  {
    int temp = 0;
    for(int mul = 1; n != 0; --n)
    {
   	  mul *= m;
      temp = mul;
    }
    System.out.println(temp);
    return temp;
  }
 
  public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
       int base = in.nextInt();
       int exp = in.nextInt();
       int pov = pow(base,exp);    
  }
}