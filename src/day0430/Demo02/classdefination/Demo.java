package day0430.Demo02.classdefination;

class Demo {
    public static void main(String[] args) {
        /*
        通过类定义了对象，如果不给对象的各个变量赋值，对象的各个成员变量会进行默认的初始化
        数值型数据默认初始化为0
        字符型数据默认初始化为码值为0的字符
        布尔类型默认初始化为false
        引用型默认初始化为null
         */
        //创建一个人对象，模拟现实生活中一个人出生
        person p1 = new person();

        person p3 = new person("lisi", 11, "中国");
/*
        person p2 = new person();
        p2.country = "日本";
        p2.showInfo();
 */

    }
}
