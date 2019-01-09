package day0427;
/*
一个整数，他加上100后是一个完全平方数，再加上168又是一个完全平方数，请问这个数是多少？
若一个数能表示称某个数的平方形式，则成为这个数为完全平方数
 */
class Demo10 {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            if(isPerfectSquare(num +100) && isPerfectSquare(num+168)) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
    private static boolean isPerfectSquare(int num) {
        for(int i=1; i<=num/2; i++) {
            if(num == i*i) {
                return true;
            }
        }
        return false;
    }
}
