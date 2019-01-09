package day0517;

class Demo {
    public static void main(String[] args) {
        TestObject obj = new TestObject();
        System.out.println(obj);
//        System.out.println(obj.hashCode());
        /*
        重写toString（）方法之前
        输出结果：day0517.TestObject@2503dbd3

        println()打印对象的方法定义为：
        public void println(Object x) {
        //println（）方法通过参数x接受一个对象，先把接收来的x转化为字符串再打印
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        在String类中，valueOf（）方法可以吧一个对象转化为字符串
        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }
        在这个方法中，会调用对象的toString（）方法，这个toSting（）是从object类中继承下来的
        object类中toString（）方法
        Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的
        无符号十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于：
                getClass().getName() + '@' + Integer.toHexString(hashCode())
                                完整类名  @  对象的哈希码的十六进制表示
         */
        //想在打印某个对象时，打印的是这个对象的各个字段的值
        //从object类中继承的toString（）方法满足不了子类的需求了，重写toString（）方法
        SonObject son = new SonObject();
        System.out.println(son);
    }
}
