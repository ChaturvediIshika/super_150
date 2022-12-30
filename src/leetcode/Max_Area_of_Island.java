package leetcode;

public class Max_Area_of_Island {
    static boolean visited[][];
    public static void main(String[] args) {
        int area[][]={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        visited=new boolean[area.length][area[0].length];
        int max=0;
        for (int i=0;i< area.length;i++){
            for (int j=0;j<area[0].length;j++){
                max=Math.max(max,count(area,i,j));
            }
        }
        System.out.println(max);
    }
    public static int count(int a[][],int i, int j){
        if(i<0 || j<0 ||i>=a.length ||j>=a[0].length || visited[i][j] ||a[i][j]==0)
            return 0;
        visited[i][j]=true;
        return (1+count(a,i+1,j)+count(a,i-1,j)+count(a,i,j+1)+count(a,i,j-1));
    }
}
