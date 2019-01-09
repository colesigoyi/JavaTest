/*
从键盘上输入n个整数保存到数组中，找出最大数
 */
import java.util.Scanner;
class Demo79 {
    public static void main(String[] args) {
        //从键盘上输入正数的个数，就是数组的长度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数的个数");
        int n = sc.nextInt();

        //先定义一个数组
        int [] numArr = new int[n];

        //读取数据，保存到数组中
        for(int i=0; i<n; i++){
            System.out.println("请输入第" + (i+1) + "个数");
            //读取后，保存到数组中
            numArr[i] = sc.nextInt();
        }

        //打印数组中的每一个元素
        for( int x : numArr){
            System.out.println( x );
        }

        //从数组中找到最大数
        //先假设索引值为0的元素最大，依次从1的位置开始比较
        int max = numArr[0];
        for( int i=1; i<numArr.length; i++){
            if( numArr[i] > max ){
                max = numArr[i];
            }
        }
        System.out.println("max==" + max);
    }
}
