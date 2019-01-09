/*
    计算1+2+3....+100的和
 */
class Demo49 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;          //保存累加和
        while( num < 100 ){
            num++;
            sum = sum + num;
        }
        System.out.println( "sum=" + sum );
    }
}
