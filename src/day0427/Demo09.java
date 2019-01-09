package day0427;
/*
一个偶数总能表示称两个素数之和
 */
class Demo09 {
    public static void main(String[] args) {
        for(int n=10; n<20; n++) {
            evenEqualsTwoPrime(n);
        }
    }

    //把一个偶数表示称两个素数之和
    private static void evenEqualsTwoPrime(int num) {
        for( int x=1; x<=num/2; x++) {
            if( Demo06.isPrime(x) && Demo06.isPrime(num-x)) {
                System.out.println(num + "=" + x + "+" + (num-x));
            }
        }
    }
}
