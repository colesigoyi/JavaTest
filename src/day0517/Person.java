package day0517;

import java.util.Objects;

class Person01 {
    String name;
    int age;
    String gender;
    String personID;

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", personID='" + personID + '\'' +
                '}';
    }
    //重写equals（）方法，根据两个对象的身份证号，即personID字段判断两个对象是否相等
    //根据哈希约定，如果两个对象equals相等，这两个对象的哈希吗也应该一样
    @Override
    public boolean equals(Object o) {
        //当前对象和需要比较的对象是堆中的同一个对象
        if (this == o) return true;
        //如果需要比较的对象是null，返回false，判断当前对象和需要比较的对象类型是否一致
        if (o == null || getClass() != o.getClass()) return false;
        //需要比较的对象时Person对象，需要把参数对象obj强制转换成Person类型
        Person01 person01 = (Person01) o;
        return Objects.equals(personID, person01.personID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personID);
    }

    public Person01(String name, int age, String gender, String personID) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personID = personID;
    }

    public Person01() {
    }
}
