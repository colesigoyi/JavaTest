package day0521.PetTest;

class Pet {
    String nickname;
    String color;
    int age;

    //构造方法
    public Pet(String nickname, String color, int age) {
        super();
        this.nickname = nickname;
        this.color = color;
        this.age = age;
    }
    //宠物会叫
    public void bark(){
        System.out.println("宠物会叫");
    }

}
