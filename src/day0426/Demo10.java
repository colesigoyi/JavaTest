package day0426;
/*
方法的形参与实参是相互独立的
 */
class Demo10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20; //X,Y是实参

        swap(x, y);
        System.out.println("x==" + x + ",y==" + y);
    }
    /*
    定义一个方法，实现两个整数的交换
     */
    public static void swap(int m, int n) { //m,n是形参
        int t = m;
        m = n;
        n = t;
    }
}
