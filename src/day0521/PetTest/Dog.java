package day0521.PetTest;
/*
1、小狗类继承宠物类
 */
class Dog extends Pet {
    String variaty;         //品种


    //构造方法
    public Dog(String nickname, String color, int age, String variaty) {
        super(nickname, color, age);
        this.variaty = variaty;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "variaty='" + variaty + '\'' +
                ", nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    //2、重写父类的方法
    @Override
    public void bark() {
        System.out.println("汪汪~~~~~~~~~~");
    }
}