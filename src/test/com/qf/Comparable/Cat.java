package test.com.qf.Comparable;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 19:31
 * @ desc:
 **/

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(){}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        /*
        if(this.age < o.age){
            return -1;
        }
        if(this.age > o.age){
            return 1;
        }
        return 0;
        */
        return this.age - o.age;
    }
}
