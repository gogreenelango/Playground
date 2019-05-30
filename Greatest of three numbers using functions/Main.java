import java.util.Scanner;
class Main{
  public static int greatest_of_3_numbers(int n1, int n2, int n3)
  {
    if((n1 > n2) && (n1 > n3))
    {
      System.out.print(n1);
      return n1;
    }
    else if(n2 > n3)
    {
      System.out.print(n2);
      return n2;
    }
    else
    {
      System.out.print(n3);
      return n3;
    }
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      greatest_of_3_numbers(num1, num2, num3);
	    // Type your code here
	}
}