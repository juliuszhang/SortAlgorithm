import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/19 4:04 下午
 * 插入排序
 */
public class InsertSort {

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i - 1;
            int current = arr[i];
            while (preIndex > 0 && current < arr[preIndex]) {
                //元素往后移动给要插入的数据让位
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 9, 9, 5, 10};
        new InsertSort().insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
