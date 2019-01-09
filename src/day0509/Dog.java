package day0509;

class Dog {
    private String name;
    private String gender;
    private int height;
    private int age;
    private String dogID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if("公".equals(gender) || "母".equals(gender)){
            this.gender = gender;
        }else {
            System.out.println("性别不合理。");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDogID() {
        return dogID;
    }

    public void setDogID(String dogID) {
        this.dogID = dogID;
    }

    public static void main(String[] args) {
    }
}
