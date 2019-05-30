
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int list[] = new int[t];
    for(int index = 0;index < t; index++)
    {
      list[index] = sc.nextInt();  
    }
    int n=t/2;
    for(int i = 0; i <= n-2; i++)
   {
     for(int j = 0; j<= n-2-i; j++)
     {
       if(list[j] > list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
   for(int i = 0; i < t; i++)
   System.out.print(list[i]+" ");
    
  }
}