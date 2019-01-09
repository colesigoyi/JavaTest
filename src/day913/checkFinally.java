package day913;

/**
 * @author taoxuefeng
 * @create 2018-09-29 7:31 PM
 * @desc
 **/

public class checkFinally {
    public static int checkFinally() {
        try {
            int a = 1/0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
    public static void main(String[] args) {
        int i = checkFinally();
        System.out.println(i);
    }
}

