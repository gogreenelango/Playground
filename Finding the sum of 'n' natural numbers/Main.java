import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    
        int num = sc.nextInt();
        long factorial = 0;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial += i;
        }
        System.out.print(factorial);
  }
}