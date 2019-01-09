package day0521.PetTest;

/*
小猫类继承宠物类
 */
class Cat extends Pet {

    //构造方法
    public Cat(String nickname, String color, int age) {
        super(nickname, color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void bark() {
        System.out.println("喵喵~~~~~~~~");
    }
}
