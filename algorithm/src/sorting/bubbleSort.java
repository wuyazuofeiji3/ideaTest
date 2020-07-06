package sorting;

/**
 * 冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 6, 4, 9, 8, 144, 6122000, 1024};
        for (int i = 0; i < arr.length; i++) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {//arr.length - i - 1是因为冒泡是把每轮循环中较大的数飘到后面
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) { //即这两个相邻的数是逆序的，交换
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;//没有数据交换，数组已经有序，退出排序
        }
        System.out.println("有小到大排序");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
