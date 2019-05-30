import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
   Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    
    int arr[]= new int[n];
    
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
        }
    int j=0;
    int k=1;
    int l=0;
    if(arr[j]>arr[k])  l=j;
    else l=k;
    
    for(int i=1;i<n;i++){
    if(arr[j]>=arr[i])
      j=j;
    
    else{
      j=i;
      
    }}
  
    System.out.println(j); 
    
   
  }
}