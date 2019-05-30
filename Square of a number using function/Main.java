import java.util.Scanner;
class Main
{

 public static int output(int n){
    int sum = n*n;
    return sum;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
       Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
    
      int o=output(n);
 
	         System.out.println(o);
	    }}