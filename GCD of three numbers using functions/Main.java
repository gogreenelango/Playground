import java.util.Scanner;
public class Main
{
  public static int gcd_of_3_numbers(int n1, int n2, int n3)
  {
    int min_element;
    int gcd = 0;
    if((n1<n2)&&(n1<n3))
    {
      min_element = n1;
    }
    else if((n2<n3)&&(n2<n1))
      min_element = n2;
    else
    {
      min_element = n3;
    }
   
      if((n1 % min_element == 0) &&(n2 % min_element == 0) && (n3 % min_element == 0))
        gcd = min_element;
  
        System.out.print(gcd);
	 return gcd;
  }
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      gcd_of_3_numbers(num1,num2,num3);// Type your code here
	}
}