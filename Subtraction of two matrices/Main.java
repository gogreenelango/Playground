import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int m1[][]=new int[r][c];
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    m1[i][j]=sc.nextInt();
    }
    }
    int m2[][]=new int[r][c];
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    m2[i][j]=sc.nextInt();
    }
    }
    int k=0;
    int m3[][]=new int[r][c];
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    k=m1[i][j]-m2[i][j];
      m3[i][j]=k;
    }
    }
    
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    System.out.print(m3[i][j]+" ");
    }
      System.out.println();
    }
  }
}