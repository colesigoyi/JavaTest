/*
打印1~100之间所有的素数
 */
class Demo77 {
    public static void main(String[] args) {
        //遍历1~100之间所有的数，如果这个数是素数，就打印
        for( int num = 2; num <=100; num++){
            //找num这个数，除了1和它本身之外的余数，如果有就说明不是素数
            int chushu = 1;
            for( int x = 2; x < num; x++){
                if( num%x == 0){
                    chushu = x;
                }
            }
            if( chushu == 1 ) {
                System.out.println( num );
            }
        }
    }

    public static void main11(String[] args) {
        //遍历1~100之间所有的数，如果这个数是素数，就打印
        for( int num = 2; num <=100; num++){
            //如果是素数就打印
            boolean isPrime = true;
            for( int x = 2; x < num; x++){
                if( num%x == 0){
                    isPrime = false;
                }
            }
            if( isPrime ) {
                System.out.println( num );
            }
        }
    }
}
