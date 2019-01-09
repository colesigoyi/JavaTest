/*
    所有的循环都可以使用while循环
    所有的循环都可以使用for循环

    一般情况下，当循环次数确定时，使用for循环，循环次数不确定时，使用while循环
 */
class Demo60 {
    public static void main(String[] args) {
        //计算1+2+...+100的和
        int sum = 0;
        for(int num = 1; num <=100; num++){
            sum += num;
        }
        System.out.println("sum = " + sum);

        //从键盘上输入N个正整数，输入-1结束，打印最大的数
        //循环次数不确定，建议使用while循环
    }
}
