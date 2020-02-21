import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yibozhang
 * @date 2020/2/21 10:21 上午
 * 桶排序
 */
public class BucketSort {

    public int[] bucketSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return bucketSort(arr, min, max);

    }

    public int[] bucketSort(int[] arr, int min, int max) {
        int range = max - min;
        int bucketRange = 5;
        int bucketsSize = range / bucketRange + 1;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketsSize; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int num : arr) {
            int index = (num - min) / bucketRange;
            buckets.get(index).add(num);
        }

        //对每个桶里面的元素单独做一次排序 简单起见每个桶内的排序就调用api自带的方法了
        for (List<Integer> bucket : buckets) {
            bucket.sort(Integer::compare);
        }

        return buckets.stream().flatMap(List::stream).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 5, 3, 7, 6, 8, 8, 10, 11};
        System.out.println(Arrays.toString(new BucketSort().bucketSort(arr)));
    }


}
