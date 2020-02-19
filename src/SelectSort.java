import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/19 3:59 下午
 * 选择排序
 */
public class SelectSort {

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    swap(arr, j, minIndex);
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
        int[] arr = new int[]{1, 3, 2, 9, 9, 5, 10};
        new SelectSort().selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
