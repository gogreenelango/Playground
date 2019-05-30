import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
      String a=sc.nextLine();
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      StringBuilder ss= new StringBuilder(a.replace(s1,s2));
      System.out.println(ss);
    }
}