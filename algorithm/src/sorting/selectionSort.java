package sorting;

/**
 * 选择排序
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 6, 4, 9, 8, 144, 6122000, 1024};
        for (int i = 0; i < arr.length; i++) {//做第i趟排序
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {//找出最小值
                if (arr[min] > arr[j]) {
                    min = j;//记下最小值的下标
                }
            }
            if (i != min) {//内层循环结束，如果本轮找到的最小值不是i，则进行交换位置
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("有小到大排序");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
