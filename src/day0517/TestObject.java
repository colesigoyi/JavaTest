package day0517;

class TestObject {
    String name = "学习动力";
    int xx = 10;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "-------学生信息-------- + \n" +
                "name=" + name + '\n' +
                "xx=" + xx;
    }
}
