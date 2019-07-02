package test.com.qf.EnumDemo;

/**
 * 定义一个枚举类
 */
public enum Color implements Info{
    RED(10){
        @Override
        public String getColor2() {
            return "red";
        }
    }, GREEN(20) {
        @Override
        public String getColor2() {
            return "green";
        }
    }, BLUE(30) {
        @Override
        public String getColor2() {
            return "blue";
        }
    };    //代表枚举的对象

    private int color;
    private Color(){
        System.out.println("无参构造器");

    };

    private Color(int color) {
        this.color = color;
        System.out.println("有参构造器");
    }

    @Override
    public int getColor() {
        return color;
    }
    public abstract String getColor2();
}
