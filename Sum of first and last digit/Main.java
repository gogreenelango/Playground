import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=a%10;
      char c=String.valueOf(a).charAt(0);
      
      System.out.println(b+Character.getNumericValue(c));
      
      
      
	}
}