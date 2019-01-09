package day0521.interface1;
/*
任何一个类实现接口，重写接口的抽象方法，具有了接口中定义的功能
 */
class Teacher implements IWorking {
    public static void main(String[] args) {
        System.out.println();
    }

    @Override
    public void sendAd() {
        System.out.println("老师发传单~~~~~~~~");
    }
}
