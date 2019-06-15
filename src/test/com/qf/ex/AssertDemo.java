package test.com.qf.ex;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 19:13
 * @ desc: 断言
 **/

public class AssertDemo {
    public static void main(String[] args) {
        int result = add(10, 10);
        System.out.println(result);
        assert result == 10:"结果不正确";
    }
    private static int add(int a, int b){
        return a + b;
    }
}
