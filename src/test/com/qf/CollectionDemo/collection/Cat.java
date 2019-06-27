package test.com.qf.CollectionDemo.collection;

import java.util.Objects;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-27 12:15
 * @ desc: 测试类
 **/

public class Cat {

    private String name;
    private int age;
    private int id;

    public Cat() {
        super();
    }

    public Cat(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                id == cat.id &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
