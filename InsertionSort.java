import java.util.Arrays;

public class InsertionSort {

    static int[] insertionSort(int[] nums)
    {
       int size = nums.length;
       for ( int i = 1; i < size; ++i) {
        int key = nums[i];
        int j = i - 1;

        while (j >= 0 && nums[j] > key) {
            nums[j+1] = nums[j];
            j = j - 1;
        }
        nums[j+1] = key;
       }  
        return nums;
    }


    public static void main(String args[])
    {
        int[] arr = {5,1,3,7,2};
        System.out.println("Contents of unsorted array: " + Arrays.toString(arr));
        arr = insertionSort(arr);
        System.out.println("Contents of unsorted array: " + Arrays.toString(arr));

    }


}