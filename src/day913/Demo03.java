package day913;

/**
 * @author taoxuefeng
 * @create 2018-09-25 上午12:40
 * @desc
 **/

class Point<T> {
    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }
    public void setY(T y) {
        this.y = y;
    }
    public T getX() {
        return this.x;
    }
    public T getY() {
        return this.y;
    }

}
public class Demo03 {
    public static void main(String[] args) {
        //Point<Integer> p = new Point<Integer>();
        Point<Float> p = new Point<Float>();
        p.setX(30.3f);
        p.setY(50.3f);
        System.out.println("X的坐标：" + p.getX());
        System.out.println("Y的坐标：" + p.getY());
    }
}
