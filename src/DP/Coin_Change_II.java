package DP;

public class Coin_Change_II {
    public static void main(String[] args) {
        int amt=5;
        int coins[]={1,2,5};
        System.out.println(change(coins,amt,0));
        System.out.println(changeDP(coins,amt));
    }
    public static int change(int coins[],int amt,int i){
        if(amt==0)
            return 1;
        if(i==coins.length)
            return 0;
        int inc=0,exc=0;
        if(coins[i]<=amt){
            inc=change(coins,amt-coins[i],i);
        }
        exc=change(coins,amt,i+1);
        return inc+exc;
    }
    public static int changeDP(int coins[],int amt){
        int dp[][]=new int[coins.length+1][amt+1];
        for(int i=0;i<dp.length;i++)
            dp[i][0]=1;
        for(int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                int inc=0,exc=0;
                if(coins[i-1]<=j){
                    inc=dp[i][j-coins[i-1]];
                }
                exc=dp[i-1][j];
                dp[i][j]=inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
