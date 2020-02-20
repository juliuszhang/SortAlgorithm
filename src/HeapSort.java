import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/20 10:29 上午
 * 堆排序
 */
public class HeapSort {

    public void heapSort(int[] arr) {
        buildHeap(arr, arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            //交换最后一个节点和第一个节点
            swap(arr, i, 0);
            buildHeap(arr, i, 0);
        }
    }

    public void buildHeap(int[] arr, int n, int i) {
        if (i >= n) return;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if (left < n && arr[left] > arr[max]) max = left;
        if (right < n && arr[right] > arr[max]) max = right;
        if (max != i) {
            swap(arr, max, i);
            buildHeap(arr, n, max);
        }
    }

    public void buildHeap(int[] arr, int n) {
        int lastNodeParent = n / 2 - 1;
        for (int i = lastNodeParent; i >= 0; i--) {
            buildHeap(arr, n, i);
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1, 6};
        new HeapSort().heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
