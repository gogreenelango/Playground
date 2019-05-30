import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      
      char c=String.valueOf(a).charAt(1);
      
      System.out.println(Character.getNumericValue(c));
      
      
      
	}
}