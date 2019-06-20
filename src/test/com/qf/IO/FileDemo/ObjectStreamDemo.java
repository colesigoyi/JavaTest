package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-20 14:17
 * @ desc: 对象流
 **/

public class ObjectStreamDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        writerObject(path.getPath());
    }

    private static void writerObject(String path){
        Dog dog = new Dog("wangwang", 2,"母");
        File file = new File(path + "dog.obj");

        try {
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(dog);
            oos.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
