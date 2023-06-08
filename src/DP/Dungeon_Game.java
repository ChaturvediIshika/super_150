package DP;

import java.util.Arrays;

public class Dungeon_Game {
    public static void main(String[] args) {
        int dungeon[][]={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int dp[][]=new int[dungeon.length][dungeon[0].length];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        game(dungeon,dp,0,0);
        System.out.println(dp[0][0]);
    }
    public static int game(int dungeon[][],int dp[][],int i,int j){
        if(i>=dp.length || j>=dp[0].length)
            return Integer.MAX_VALUE;
        if(i==dungeon.length-1 && j==dungeon[0].length-1)
            return dp[i][j]=dungeon[i][j]>0?1:1-dungeon[i][j];
        if(dp[i][j]!=-1)
            return dp[i][j];
        int a1=game(dungeon,dp,i+1,j);
        int a2=game(dungeon,dp,i,j+1);
        int energy=Math.min(a1,a2)-dungeon[i][j];
        return  dp[i][j]=energy>0? energy:1;
    }
}
