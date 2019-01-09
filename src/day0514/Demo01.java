package day0514;

class Demo01 {
    public static void main(String[] args) {
        Person p1 = new Person("lisisi","女",168,58,"100100100");
        p1.showInfo();
        p1.setName("御姐很忧伤");
        p1.showInfo();
        Person p2 = new Person();
        p2.setName("zhangsan");
        p2.showInfo();
    }
}
