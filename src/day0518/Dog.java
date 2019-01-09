package day0518;

class Dog extends Pet {
    String variaty;         //品种


    //构造方法
    public Dog(String nickname, String color, int age, String variaty) {
        super(nickname, color, age);
        this.variaty = variaty;
    }
}
