package day0517;

class Student extends Person01 {
    String stuID;
    int score;

    @Override
    public String toString() {
        return "Student{" +
                "stuID='" + stuID + '\'' +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", personID='" + personID + '\'' +
                '}';
    }
}
