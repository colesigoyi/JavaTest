package day1216;

/**
 * @author taoxuefeng
 * @create 2018-12-16 16:29
 * @desc 反转排序
 **/

public class ReverseSort {
    public static void main(String[] args) {
        int[] array = {63,4,24,1,3,15};
        int[] array_2 = {789,54,2,678,764,345,56,85,37,5,89,32,75,48,9434,3457,345,336};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array_2);
        sorter.sort(array);
    }
    public void sort(int[] array) {
        System.out.print("原数组为：");
        showArray(array);
        int temp;
        int len = array.length;
        for(int i=0; i<len/2; i++) {
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        System.out.print("数组反转后：");
        showArray(array);
    }
    private void showArray(int[] array) {
        for(int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
