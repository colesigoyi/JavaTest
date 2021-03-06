/*
    位运算符
        按位于&， 按位或|，按位异或^，按位取反~

        如果& | ^ 两侧为布尔值，就是逻辑操作，如果两侧为整数就是按位操作
        位运算是对整数的二进制位进行运算
            1 & 1 == 1
            0 | 0 == 0
            1 ^ 0 == 1
            0 ^ 1 == 1
            ~1    == 0
            ~0    == 1
 */
public class Demo17 {
    public static void main(String[] args){
         int a = 10;
         int b = 20;
         int c = a&b;
        System.out.println("c==" + c);      //c==0
        /*
            a变量的值为10，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0000 1010
            b变量的值为20，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0001 0100
            按位与&
            --------------------------------------------
                0000 0000 0000 0000 0000 0000 0000 0000
         */
        c = a | b;
        System.out.println("c==" + c);      //c==30
        /*
            a变量的值为10，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0000 1010
            b变量的值为20，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0001 0100
            按位或|
            --------------------------------------------
                0000 0000 0000 0000 0000 0000 0001 1110
         */
        c = a ^ b;
        System.out.println("c==" + c);      //c==30
        /*
            a变量的值为10，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0000 1010
            b变量的值为20，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0001 0100
            按位异或^
            --------------------------------------------
                0000 0000 0000 0000 0000 0000 0001 1110
         */
        c = ~a;
        System.out.println("c==" + c);      //c==-11
        /*
            a变量的值为10，他的二进制形式为：
                0000 0000 0000 0000 0000 0000 0000 1010
            按位取反~
            --------------------------------------------
                1111 1111 1111 1111 1111 1111 1111 0101
         */

        //面试题：如何实现两个数的原地交换，不借助第三个变量，实现两个数的交换
        int x = 10;
        int y = 20;
        //方法1：
        x = x + y;      //x==30
        y = x - y;      //y==10
        x = x - y;      //x==20
        System.out.println("x==" + x + ",y==" + y);

        //方法2：
        x = 10;
        y = 20;
        x = x ^ y;      //x==30
        y = x ^ y;      //y==10
        x = x ^ y;      //x==20
        System.out.println("x==" + x + ",y==" + y);

        //实际应用中，实现两个数的交换，建议使用以下方法
        x = 10;
        y = 20;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x==" + x + ",y==" + y);
    }
}
