package day1216;

/**
 * @author taoxuefeng
 * @create 2018-12-16 15:34
 * @desc 冒泡排序
 **/

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {63,4,24,1,3,15};
        int[] array_2 = {789,54,2,678,764,345,56,85,37,5,89,32,75,48,9434,3457,345,336};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array_2);
        sorter.sort(array);
    }
    public void sort(int[] array) {
        int count = 0;
        for(int i=1; i<array.length; i++) {
            for(int j=0; j<array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    count++;
                }
            }
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
