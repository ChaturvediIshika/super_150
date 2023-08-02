package Searching;

public class LinearSearch {
    public static int search(int arr[], int x)
    {
        int N = arr.length;
        for (int i = 0; i < N; i++) {//time Complexity O(n)
            if (arr[i] == x)//space complexity O(1)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);
    }
}
