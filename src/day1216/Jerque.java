package day1216;

/**
 * @author taoxuefeng
 * @create 2018-12-16 16:48
 * @desc String, String-Builder
 **/

public class Jerque {
    public static void main(String[] args) {
        String str = "";
        long starTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        System.out.println("String消耗时间：" + time + "ms");//String消耗时间：23563ms

        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("StringBuilder消耗时间：" + time + "ms");//StringBuilder消耗时间：2ms
    }
}
