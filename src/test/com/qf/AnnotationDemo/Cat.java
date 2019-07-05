package test.com.qf.AnnotationDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-07-04 23:32
 * @ desc:
 **/
@MyAnnotation(name = "bin",like = {"鱼","肉"},color = Color.RED)//数组要用大括号
public class Cat {
    private String name;
    private int age;
    private Color color;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //用于验证方法是否覆盖父类中的方法
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //此方法不推荐使用
    @Deprecated
    public String printInfo(){
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
