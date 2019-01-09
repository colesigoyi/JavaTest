package day0509;
/*
定义Person类
共同的属性(静态特征)：姓名，性别，身高，体重。身份证号...
共同的行为：吃，喝，睡...

构造方法：1、创建对象时，就给对象的各个字段赋值
        2、特点： (1)构造方法的方法名与类名相同
                (2)构造方法没有返回值，也没有返回值类型
                (3)构造方法可以通过参数来接受数据
                (4)在没有显示定义构造方法之前，系统有一个默认的无参构造方法
                 当程序员显示定义了构造方法之后，系统默认的无参构造方法就没有了
                (5)构造方法可以参数进行重载
                (6)构造对象时，跟在new运算符后面，由系统调用


封装：
    1、为什么封装
        如果用户直接修改属性，不安全
    2、如何实现封装
        （1）、把成员变量私有化，即用private修饰
            praivate修饰的成员，只能在当前类当中使用
        （2）、提供公共的getter()/setter()方法实现对私有数据的访问
        （3）、建议：
                在定义实体类时，要求把所有字段都设置为private私有的
                如果需要访问就提供对应的getXXX()/setXXX()方法
                只提供无参的构造方法，不提供有参的构造方法
 */
public class Person {
    //属性保存在变量中
    private String name;
    private String gender;
    private int height;
    private int age;
    private String personID;
    /*
    提供公共的getter()/setter()方法实现对私有数据的访问
    getter()方法的方法名是get+字段名(),注意第二个单词的首字母大写
    getter()方法的返回值类型就是字段的类型
    */


    //对于姓名，只提供了getter()没有setter()方法，这个字段只可以读不可以写，你能修改
    public String getName() {
        return name;
    }
    //对于性别，同时提供了getter()/setter()方法，这个字段即可以读又可以写
    public String getGender() {
        return gender;
    }
    /*
    setter()方法的方法名：set+字段名，第二个单词首字母大写
    setter()方法的作用是设置字段的值，需要一参数来接受数据，不需要返回值
    如果必要，可以在setter()方法中对参数接受的数据进行合理性验证
     */
    public void setGender(String gender){
        if("男".equals(gender) || "女".equals(gender)){
            this.gender = gender;
        }else {
            System.out.println("性别不合理。");

        }
    }
    //对于height字段，如果只提供setter()方法，没有提供getter（）方法，这个字段就是只写字段


    public void setHeight(int height) {
        if(height >=0 && height <=260){
            this.height = height;
        }
    }

    //无参构造重载
    public Person(){
    }
    //无参构造重载
    public Person(String _name,String _gender){
        this.name = _name;
        this.gender = _gender;
    }
    //构造方法
    //有参构造破坏了数据的封装性
    public Person(String _name,String _gender,int _height,
                  int _age,String _personID) {
        name = _name;
        gender = _gender;
        height = _height;
        age = _age;
        personID = _personID;
        return; //作用1：返回一个值
        // 作用2：结束方法的执行
    }

    //行为适用方法来表示                 //static修饰main方法
    public void eat() {
        System.out.println("人都需要吃饭");
    }
    public void drink() {
        System.out.println("人都需要喝水");
    }
    public void showInfo() {
        System.out.println("--------个人信息-------");
        System.out.println("name:" + name);
        System.out.println("genger:" + gender);
        System.out.println("身高:" + height);
        System.out.println("年龄:" + age);
        System.out.println("ID:" + personID);
    }

}
