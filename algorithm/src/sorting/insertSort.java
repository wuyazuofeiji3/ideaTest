package sorting;

/**
 * 插入排序
 */
public class insertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 6, 4, 9, 8, 144, 6122000, 1024};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];//保存每次需要插入的那个数
            int j;
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];//把大于需要插入的数往后移动，最后不大于temp的数空出来
            }
            arr[j] = temp;//将需要插入的数放入这个位置
        }
        System.out.println("有小到大排序");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
