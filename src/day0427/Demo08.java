package day0427;
/*
求1+2！+3！+...+n！的和
 */
class Demo08 {
    public static void main(String[] args) {
        System.out.println(getAccumulation(1));
        System.out.println(getAccumulation(2));
        System.out.println(getAccumulation(3));
        System.out.println(getAccumulation(4));
        System.out.println(getAccumulation(5));
        System.out.println(getAccumulation(6));

    }
    public static long getAccumulation(int num) {
        long sum = 0;
        for(int i =1; i<=num; i++) {
            sum += getFactorial( i );
        }
        return sum;
    }
    //求x的阶乘
    public static long getFactorial(int num) {
        long result = 1;
        for(int i=1; i<=num; i++) {
            result *= i;
        }
        return result;
    }
}
