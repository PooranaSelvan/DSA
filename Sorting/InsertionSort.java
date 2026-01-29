import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13, 20, 46, 24, 20, 9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++) {
            for(int j=i-1;j>=0;j--) {
                if(arr[j] > arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
