package test.com.qf.ex;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 17:53
 * @ desc:自定义异常通常都是继承一个异常类实现
 *          1、Throwable
 *          2、Exception
 *          3、RuntimeException
 *          自定义异常，通常的实现是提供构造方法
 *          异常对象本身是没有实际的功能的，只是一个有意义的标识
 **/

public class MyException extends RuntimeException {
    public MyException(){
        super();
    }
    public MyException(String message) {
        super(message);
    }
}
