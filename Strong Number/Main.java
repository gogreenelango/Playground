import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
     
        int n, t, f, r, i, s = 0;

        Scanner sc = new Scanner(System.in);
     
        n = sc.nextInt();
        t = n;

        while (n > 0) {
            r = n % 10;
            f = 1;
            for (i = 1; i <= r; i++) {
                f = f * i;
            }
            s = s + f;
            n = n / 10;
        }

        if (s == t)
            System.out.println("Yes");
        else
            System.out.println("No");
      
	}
}