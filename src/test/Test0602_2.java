package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 01:04
 * @ desc:
 *       A
 *      BBB
 *     CCCCC
 *    DDDDDDD
 *   EEEEEEEEE
 *  FFFFFFFFFFF
 * GGGGGGGGGGGGG
 **/

public class Test0602_2 {
    public static void main(String[] args) {
        char[] cs = {'A','B','C','D','E','F','G',};
        int len = cs.length;

        for(int i=1; i<=len; i++){
            for(int j=i; j<len; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print(cs[i-1]);
            }
            System.out.println();
        }
    }
}
