package leetcode;

public class UniquePath3 {
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        int m=0,n=0,k=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                if(arr[i][j]==1){
                    m=i;n=j;
                }
                else if(arr[i][j]==0)
                    k++;
            }
        }
        System.out.println(path_travel(arr,m,n,k));
    }
    public static int  path_travel(int arr[][],int i,int j,int k){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==-1)
            return 0;
        if(arr[i][j]==2){
            return k==-1? 1:0;
        }
        arr[i][j]=-1;
        k--;
        int tp=path_travel(arr,i+1,j,k)+path_travel(arr,i-1,j,k)+path_travel(arr,i,j+1,k)+path_travel(arr,i,j-1,k);
        arr[i][j]=0;
        k++;
        return tp;

    }
}
