import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code heren1%
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int n1=a/100;
    int n2=(a/10)%10;
    int n3=a%10;
    System.out.println(n3+""+n2+""+n1);
    
  }
}