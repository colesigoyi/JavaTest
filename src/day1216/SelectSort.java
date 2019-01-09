package day1216;

/**
 * @author taoxuefeng
 * @create 2018-12-16 16:05
 * @desc 直接选择排序
 **/

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {63,4,24,1,3,15};
        int[] array_2 = {789,54,2,678,764,345,56,85,37,5,89,32,75,48,9434,3457,345,336};
        SelectSort sorter = new SelectSort();
        sorter.sort(array_2);
        sorter.sort(array);
    }
    public void sort(int[] array) {
        int index;
        int count = 0;
        for(int i=1; i<array.length; i++) {
            index = 0;
            for(int j=1; j<=array.length-i; j++) {
                if(array[j] > array[index]) {
                    index = j;
                }
            }
            int temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index] = temp;
            count++;
        }
        System.out.println("排序次数：" + count);
        showArray(array);
    }
    private void showArray(int[] array) {
        for(int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
