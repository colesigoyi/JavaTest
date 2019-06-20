package test.com.qf.IO.FileDemo;

import java.io.*;
import java.util.Arrays;

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
        readObject(path.getPath());
        writerObjects(path.getPath());
        readObjects(path.getPath());

    }
    /**
     * 对象序列化
     * 把对象写入文件：实际写入的是类名、属性名、属性类型、属性值等
     */
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
    /**
     * 反序列化
     * 从文件中把对象信息读取出来，还原成对象
     */
    private static void readObject(String path){

        File file = new File(path + "dog.obj");

        try {
            InputStream out = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(out);
            Dog dog = (Dog)ois.readObject();
            ois.close();
            System.out.println(dog);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 针对多个对象对象序列化
     * 把对象写入文件：实际写入的是类名、属性名、属性类型、属性值等
     */
    private static void writerObjects(String path){
        Dog dog1 = new Dog("wangwang", 2,"母");
        Dog dog2 = new Dog("xixi", 3,"母");
        Dog dog3 = new Dog("lala", 5,"公");

        Dog[] dogs = {dog1, dog2, dog3};

        File file = new File(path + "dogs.obj");

        try {
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(dogs);
            oos.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 多个对象反序列化
     * 从文件中把对象信息读取出来，还原成对象
     */
    private static void readObjects(String path){

        File file = new File(path + "dogs.obj");

        try {
            InputStream out = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(out);
            Dog[] dogs = (Dog[])ois.readObject();
            ois.close();
            System.out.println(Arrays.toString(dogs));

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
