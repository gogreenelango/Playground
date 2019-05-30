import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in); 
      int rows = in.nextInt(); 
      for(int i = rows; i > 0; i--)
      { 
        for(int j = i; j > 0; j--) 
        { 
          System.out.print(j);
        } 
        System.out.print("\n"); }
	}
}