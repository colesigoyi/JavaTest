package day0516;

class Demo05 {
    public static void main(String[] args) {
        Son xiaoMing = new Son();
        System.out.println(xiaoMing.xx);
        xiaoMing.method();
        /*
        method（）方法是从父类中继承下来的，在该方法中的xx也是从父类中继承下来的
         */
        xiaoMing.sonMethod();

        Father daMIng = new Father();
        /*
        现在daMing这个对象调用testThis（）方法，在该方法中的this就是指daMing对象
         */
        daMIng.testThis();
        //现在xiaoMing这个对象调用testThis（）方法，在该方法中的this就是指xiaoMing对象
        xiaoMing.testThis();
    }
}
