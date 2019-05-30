import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    
   s = s.replaceAll("[AaEeIiOoUu]", "");
    
    System.out.print(s);
    
  }}
