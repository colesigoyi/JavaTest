/**
 *文档注释就可以看做是这个类的一个使用说明书<br>
 *1、文档注释一般用来注释类、方法、成员变量
 即在类前面，在方法的前面，在成员变量前面可以有文档注释<p>
 2、类，方法，比那两必须使用public修饰为公共的才可以生成相应的文档
 方法，变量可以使用public修饰，也可以使用protected修饰</p>
 3、文档注释可以使用javadoc命令生成相应的文档
 javadoc -d ./doc Demo01.java
 会在当前的目录中创建一个doc文件夹，生成的html文档就在这个doc文件夹中

 */
public class Demo01 {
    /**
     * 文档注释，对成员变量进行注释，可以使用public/protected修饰

     */
    protected int xx = 123;          //成员变量
    /**
     文档注释，对方法进行注释，方法需要使用public/protected修饰
     @param args main方法的参数是一个字符串换数组
     */
    public static void main(String[]args){

        int age = 18;    //定义一个变量保存一个人的年龄

        //在屏幕上打印一行信息
        System.out.println("Hello  world!");
    }
}