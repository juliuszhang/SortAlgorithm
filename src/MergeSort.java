import java.util.Arrays;

/**
 * @author yibozhang
 * @date 2020/2/19 4:41 下午
 * 归并排序
 */
public class MergeSort {

    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        //为代码简洁暂不考虑lo = Integer.MAX_VALUE的情况
        int mid = (lo + hi) >> 1;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, mid, mid + 1, hi);
    }

    private void merge(int[] arr, int leftStart, int leftEnd, int rightStart, int rightEnd) {
        int i = leftStart;
        int j = rightStart;
        int[] tmp = new int[leftEnd - leftStart + 1 + rightEnd - rightStart + 1];
        int tmpIndex = 0;
        while (i <= leftEnd && j <= rightEnd) {
            if (arr[i] <= arr[j]) {
                tmp[tmpIndex++] = arr[i++];
            } else {
                tmp[tmpIndex++] = arr[j++];
            }
        }

        while (i <= leftEnd) {
            tmp[tmpIndex++] = arr[i++];
        }

        while (j <= rightEnd) {
            tmp[tmpIndex++] = arr[j++];
        }

        System.arraycopy(tmp, 0, arr, leftStart, tmp.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 9, 5, 10};
        new MergeSort().mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
