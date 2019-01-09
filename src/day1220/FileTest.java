package day1220;

import java.io.File;

/**
 * @author taoxuefeng
 * @create 2018-12-20 19:44
 * @desc 练习IO
 **/

public class FileTest {
    public static void main(String[] args) {
        File file = new File("/Users/taoxuefeng/Desktop/HelloWorld.txt");
        if(file.exists()) {
            file.delete();
            System.out.println(file.getName() + "已经删除。");
        }else {
            try {
                file.createNewFile();
                System.out.println(file.getName() + "创建完成。");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
