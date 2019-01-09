package day0107;

/**
 * @author taoxuefeng
 * @create 2019-01-07 20:05
 * @desc
 **/

public class AssertTest {
    /*public static void main(String[] args) {
    // TODO Auto-generated method stub
    int i = 0;
    for(i=0;i<5;i++) {
        System.out.println(i); }
    //假设程序不小心多了一句--i;
    --i;
    assert i==2;
    }*/

    public static void main(String[] args) {



        boolean isSafe = false;
        assert isSafe : "Not safe at all";
        System.out.println("断言通过!");

        int a = 1;
        assert a > 1;
        System.out.println(a);
    }
}

