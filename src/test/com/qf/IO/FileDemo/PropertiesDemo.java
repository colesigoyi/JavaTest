package test.com.qf.IO.FileDemo;

import java.io.*;
import java.util.Properties;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 14:13
 * @ desc:Properties:可以用来做配置文件,在jabaWeb，JavaEE中经常用到
 *
 *      ResourceBundle只读
 *      Properties可读可写
 **/

public class PropertiesDemo {

    public static String version;
    public static String username;
    public static String password;

    static PathFile path = new PathFile();

    //静态代码块，只会执行一次
    static {
        //readConfig();
    }

    public static void main(String[] args) {
        //readConfig();
        //writeConfig("1.0.2","txf","1234567");

        readConfig();

        System.out.println(PropertiesDemo.version);
        System.out.println(PropertiesDemo.username);
        System.out.println(PropertiesDemo.password);


    }

    /*
    读取properties配置文件
     */
    private static void readConfig(){
        Properties p = new Properties();
        try {
            //通过当前线程的类加载器，来加载指定包下的配置文件
            InputStream inStream = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("test/com/qf/res/config.properties");
            //InputStream inStream = new FileInputStream("config.properties");

            p.load(inStream);//加载文件

            //从properties中获取数据
            version = p.getProperty("app.version");
            username = p.getProperty("db.username");
            password = p.getProperty("db.password");

            inStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    对属性文件的写入操作
     */
    private static void writeConfig(String version, String username, String password){
        Properties p = new Properties();
        p.put("app.version", version);
        p.put("db.username", username);
        p.put("db.password", password);
        try {
            OutputStream out = new FileOutputStream(path.getPath() + "config.properties");

            //写文件
            p.store(out, "update config");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
