package day913.DIDItest;

/**
 * @author taoxuefeng
 * @create 2018-09-19 下午6:12
 * @desc
 **/

public class ABC {
    public static void main(String[] args) {
        int a = 10;
        long b = a++;
        long c = ++a;
        long d = 10*a++;
        System.out.println(b +"," + c +"," + d);
    }
}
