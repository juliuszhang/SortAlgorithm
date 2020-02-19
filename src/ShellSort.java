import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/19 4:12 下午
 * 希尔排序
 */
public class ShellSort {

    public void shellSort(int[] arr) {
        //计算gap 先进行一次较大距离的元素交换 减少最后gap=1时的交换
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap > 0 && arr[j] < arr[j - gap]) {
                    swap(arr, j, j - gap);
                    j -= gap;
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
        new ShellSort().shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
