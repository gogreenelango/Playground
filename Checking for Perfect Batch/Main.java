import java.util.*;
class Main
{
  public static void areSame(int e[],int d){
    int count=0;
       for(int i=1;i<d;i++){
       if(e[0]!=e[i])
        count++;
         else count=0;
       }
    if(d==3)
    System.out.println("Perfect Batch");
    else
    System.out.println("Not a Perfect Batch");
    
    }
  public static void main(String args[])
  {
    //Try your code here
   Scanner sc = new Scanner(System.in);
		    int n= sc.nextInt();
		    int d=n/3;
			   
		    int arr[]= new int[n];
		    for(int i=0;i<n;i++)
		        {
			    arr[i]=sc.nextInt();
			     }
		    sc.close();
    int sum=0;
		     int e[]= new int[d];
		     int k=0;
		     for(int j=0;j<d;j++){
		     int a=0;
		      sum=arr[a+0]+arr[a+1]+arr[a+2];
		      a=a+3;
              // System.out.println(sum);
		      e[j]=sum;
		      sum=0;
             }
   areSame(e,d);
    
    
  }
}