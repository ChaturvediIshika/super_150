package DP;

//Treats for the cows
public class Wine_Problem {
    public static void main(String[] args) {
        int wine[]={2,3,5,1,4};
        System.out.println(MaxProfit(wine,0, wine.length-1,1 ));
        System.out.println(Profit(wine));
    }
    public static int MaxProfit(int wine[],int i,int j,int y){
        if (i>j)
            return 0;
        int fst=wine[i]*y+MaxProfit(wine,i+1,j,y+1);
        int lst=wine[j]*y+MaxProfit(wine,i,j-1,y+1);
        return Math.max(fst,lst);
    }
    public static int Profit(int wine[]){
        int dp[][]=new int[wine.length][wine.length];
        for (int i=0;i<wine.length;i++)
            dp[i][i]=wine[i]*wine.length;
        int y=wine.length-1;
        for(int k=1;k<dp.length;k++){
            for(int j=k;j< wine.length;j++){
                int i=j-k;
                int fst=wine[i]*y+dp[i+1][j];
                int lst=wine[j]*y+dp[i][j-1];
                dp[i][j]=Math.max(fst,lst);
            }
            y--;
        }
        return dp[0][dp.length-1];
    }
}
