import java.util.Scanner;
class Main
{
  public static void main (String[] args)
    {
      Scanner scanner = new Scanner(System.in);
  ;
     
      int  primeNumbers =0;
     
      int n = scanner.nextInt();
     
      for (int i = 2; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(int num =i; num>1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==1)
	 {
	   
	   System.out.println(i);
	 }	
      }	
     
     
   }
}