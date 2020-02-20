import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/19 3:54 下午
 * 冒泡排序
 */
public class BubbleSort {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 9, 5, 10};
        new BubbleSort().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
