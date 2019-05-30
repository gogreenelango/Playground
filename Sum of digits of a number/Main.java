import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  
      Scanner sc = new Scanner(System.in);
     String a=sc.next();
       int sum=0;
     
      for(int i=0;i<a.length();i++){
       sum+=Character.getNumericValue(a.charAt(i));
      
      }
      
      System.out.println(sum);
      
      
      
	}
}
