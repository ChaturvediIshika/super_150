package Advance_topics.CatalanNumber;

public class catalan_number {
    public static void main(String[] args) {
        int n=4;
        System.out.println(catalan(n));
    }
    public static int catalan(int n){
        if(n==0 || n==1)
            return 1;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=ans+catalan(i-1)*catalan(n-i);
        }
        return ans;
    }
}
