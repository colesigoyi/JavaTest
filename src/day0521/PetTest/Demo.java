package day0521.PetTest;

class Demo {
    public static void main(String[] args) {
        Pet pet = new Pet("宠物","",0);
        pet.bark();

        //3、父类的引用指向子类的对象
        pet = new Dog("dahuang","",0,"");
        //4、通过父类的引用调用被重写的方法
        pet.bark();

        pet = new Cat("mimi","",0);
        pet.bark();
        /*
        在程序的执行过程中，pet父类的引用可以指向子类的对象，叫做动态绑定
         */
    }
}

