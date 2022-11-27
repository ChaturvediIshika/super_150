import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            if(n>=2000)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
