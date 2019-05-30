import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    
    Scanner sc = new Scanner(System.in);
    int s=sc.nextInt();
    String a=Integer.toString(s);
    
    
    
    int i=a.length();
    int j=0,num=0;
    boolean con=false;
    if(a.charAt(0)=='-'){
      con=true;
      j=1;
    }
    while(j<i){
    num=num*10;
      num=num+(a.charAt(j)-48);
      j++;
    }
   if(con){
   
   num=-num;
   }
    System.out.print(num);
  }
}