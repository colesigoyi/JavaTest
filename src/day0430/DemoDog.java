package day0430;

class DemoDog {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.age = 3;
        myDog.gender = "公";
        myDog.variaty = "八哥";
        myDog.nickname = "小八";

        myDog.showInfo();
        myDog.guard();
        myDog.eat();
    }
}
