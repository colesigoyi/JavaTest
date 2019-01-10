package day0110;
import Utils.Utils;
/**
 * @author taoxuefeng
 * @create 2019-01-10 11:43
 * @desc 直接选择排序：直接选择排序是从无序区选一个最小的元素直接放到有序区的最后。
 *     设数组为 a[0...n-1]。
 *     1. 初始时，数组全为无序区为 a[0..n-1]。令 i=0
 *     2. 在无序区 a[i...n-1]中选取一个最小的元素，将其与 a[i]交换。交换之后 a[0...i]
 *     就形成了一个有序区。
 *     3. i++并重复第二步直到 i==n-1。排序完成。
 *     直接选择排序无疑是最容易实现的。
 **/

public class RedirectSelectSort {
    public static void redirectSelectSort(int[] nums){
        int i, j, min;
        for(i=0; i<nums.length; i++) {
            min = i;
            for(j=i+1; j<nums.length; j++) {
                if(nums[min] > nums[j]) {
                    min = j;
                }
            }
            Utils.swapNum(nums, i, min);
        }
    }
    public static void main(String[] args) {
        int numslen = Utils.getNum();
        int[] nums = Utils.creatArray(numslen);
        System.out.println("直接选择排序之前nums：");
        Utils.printArray(nums);
        redirectSelectSort(nums);
        System.out.println("直接选择排序之后nums：");
        Utils.printArray(nums);
    }
    /*
    测试方法中不能使用键盘输入，如果使用键盘输入的话就不是一个测试方法了，在测试方法中可以用特定值表达自己的逻辑
    @Test
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入随机数个数：");
        int numslen = sc.nextInt();
        int[] nums = SortUtils.creatArray(numslen);
        System.out.println("直接选择排序之前nums：");
        SortUtils.printArray(nums);
        redirectSelectSort(nums);
        System.out.println("直接选择排序之后nums：");
        SortUtils.printArray(nums);
    }
    */
}


