package day0521.interface1;
/*
定义学生类是实现打工接口
一个类实现一个接口，需要重写接口中的抽象方法
 */
class Student implements IWorking{
    public static void main(String[] args) {
        System.out.println();
    }

    @Override
    public void sendAd() {
        System.out.println("学生发传单~~~~~");
    }
}
