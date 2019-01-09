/*
    1、定义的类必须储存在java源文件中
    2、一般情况下，java源文件名与类名相同
    3、如果类名与源文件名不相同，javac编译时，跟的是源文件名，生成的字节码文件，字节码文件名与类名相同
    4、一般情况下，一个java源文件中之定义一个类
    5、在java源文件中可以定义多个类，编译后每个类都生成一个对应的字节码文件
    6、同一个源文件中不同的类，都可以有main方法，一个类是否要定义main方法，根据这个类是否需要被运行来决定
    7、类可以使用public修饰为公共类，包是用来管理类的，
      如果A包中的类想要使用B包中的类，在B包中被使用的类必须定义为public公共类，公共类的类名必须和文件名一致

    8、类名一般每个单词的首字母都大写
       变量名，是名词，第一个单词小写，其他的每个单词首字母都大写
       方法名，是动词，第一个单词小写，其他的每个单词首字母都大写
       final常量名，一般每个字母都大写
*/

//书写规范要求
class MyClass {
    final double PI=3.14;      //final常量每个字母都大写

    public static void main(String[]args){

        int dogAge = 5;        //定义一个变量，dogAge是变量名

        System.out.println("Hello  world!");
    }
    public static void getYear(){  //getYear是方法名，第一个单词小写，其他首字母大写
        System.out.println("2018!");
    }
}


//格式规范示例
class Write {

    public static void main(String[]args){
        System.out.println("Hello  world!");

        //这是不好的编发格式
        if(true){if(true){if(true){ System.out.println("这是不好的编发格式");}}}

        //这是好的编码格式
        if(true){
            if(true){
                if(true){
                    System.out.println("这是好的编发格式");
                }
            }
        }
    }
}


//注释规范要求：
/**
    文档注释
    1、文档注释一般用来注释类、方法、成员变量
        即在类前面，在方法的前面，在成员变量前面可以有文档注释
    2、类，方法，比那两必须使用public修饰为公共的才可以生成相应的文档
        方法，变量可以使用public修饰，也可以使用protected修饰
    3、文档注释可以使用javadoc命令生成相应的文档,

 */
class Demo {
    /**
        文档注释，对成员变量进行注释，可以使用public/protected修饰
     */
    protected int xx = 123;          //成员变量
    /**
        文档注释，对方法进行注释，方法需要使用public/protected修饰
     */
    public static void main(String[]args){

        int age = 18;    //定义一个变量保存一个人的年龄

        //在屏幕上打印一行信息
        System.out.println("Hello  world!");
    }
}

/*
#java程序都必须定义在类中，编写java程序的过程就是不断的定义类的过程
#使用class来定义一个类
#Hello是程序员起的一个类
#类中的内容需要使用大队大括号括起来
#程序要运行，必须编写main方法，并且main方法的写法是固定的
#public表示公共的
#static表示静态的
#void表示main方法没有返回值
#main是一个方法名
#main后面的小括弧是方法的参数
#String[]args是定义了一个字符串类型的数组
#main方法的方法体也需要使用一对大括弧括起来
#System.out.println("Hello java world!")；是一条语句，java语句使用英文半角分号结束
#上一条语句的作用是在屏幕上打印一行信息，就是双引号引起来的内容会打印到屏幕上
#System是SUN公司定义的一个类，表示系统类
#System.out代表的是系统的标准输出设备，默认的是显示器
#println()是一个方法，其作用是在屏幕上打印一行信息
#注意在java中的符号都是英文半角，包括一切符号和空格
*/

class Hello01 {

    public static void main(String[]args){
        System.out.println("Hello  world!");
        }
}
class Hello02 {

    public static void main(String[]args){
        System.out.println("Hello stupid world!");
    }
}
class Hello03 {

    public static void main(String[]args){
        System.out.println("Hello Java world!");
    }
}
