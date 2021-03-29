import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        perm(arr,0,3);
    }
    public static void perm(int[] array,int start,int end) {
        if(start==end) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = start; i <= end; i++) {
                swap(array,start,i);
                perm(array,start+1,end);
                swap(array,start,i);
            }
        }
    }
    public static void swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}