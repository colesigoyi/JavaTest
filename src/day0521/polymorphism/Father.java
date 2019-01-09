package day0521.polymorphism;

class Father {
    int xx = 10;

    public void method(){
        System.out.println("in father method");
        System.out.println("xx==" + xx);
    }

    public static void sMethod(){
        System.out.println("in father,static method");
    }
}
