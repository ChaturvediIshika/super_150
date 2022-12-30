package leetcode;

public class Flood_Fill {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{1,1,0},{1,0,1}};
        int color=2;
        if(color!=a[1][1])
            fill(a,1,1,2,a[1][1]);
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
    public static void fill(int[][] image, int sr, int sc, int color,int i){
        if(sr<0 || sc<0 || sr>=image.length || sc>= image[0].length || image[sr][sc]!=i)
            return;
        if(image[sr][sc]==i) {
            image[sr][sc] = color;
            fill(image, sr - 1, sc, color, i);
            fill(image, sr + 1, sc, color, i);
            fill(image, sr, sc + 1, color, i);
            fill(image, sr, sc - 1, color, i);
        }
    }
}
