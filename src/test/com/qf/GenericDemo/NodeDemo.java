package test.com.qf.GenericDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 23:03
 * @ desc:泛型类
 *      T：代表参数化类型，在实际使用时才会指定具体的类型
 **/

public class NodeDemo<T> {//T代表参数化类型
    private T data;

    public NodeDemo() {
    }

    public NodeDemo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
