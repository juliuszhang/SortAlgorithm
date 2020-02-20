import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/20 12:48 下午
 * 计数排序
 */
public class CountingSort {

    public int[] countingSort(int[] arr, int min, int max) {
        int[] countArr = new int[max - min + 1];
        for (int num : arr) {
            countArr[num - min]++;
        }

        int[] result = new int[arr.length];
        int resultIndex = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i]-- > 0) {
                result[resultIndex++] = i + min;
            }
        }
        return result;
    }

    public int[] countingSort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return countingSort(arr, min, max);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 9, 5, 10};
        System.out.println(Arrays.toString(new CountingSort().countingSort(arr)));
    }
}
