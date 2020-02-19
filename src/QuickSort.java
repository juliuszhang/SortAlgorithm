import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/19 5:06 下午
 * 快速排序
 */
public class QuickSort {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = end;
        int left = start;
        int right = end;
        while (left < right) {
            while (left < right && arr[left] <= arr[pivot]) left++;
            while (left < right && arr[right] >= arr[pivot]) right--;
            swap(arr, left, right);
        }
        //left==right
        swap(arr, left, pivot);
        return left;

    }

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = partition(arr, start, end);
            quickSort(arr, start, mid - 1);
            quickSort(arr, mid + 1, end);
        }
    }


    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 8, 1, 2, 9, 4, 7, 6};
        new QuickSort().quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
