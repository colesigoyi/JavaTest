package day1221;

import java.io.*;

/**
 * @author taoxuefeng
 * @create 2018-12-21 17:17
 * @desc 通过缓存输入输出流讲文件中的信息分行显示
 **/

public class Student {
    public static void main(String[] args) {
        String content[] = {"好久不见！", "最近好吗？", "常联系。"};
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);
            for (int k = 0; k < content.length; k++) {
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            while ((s = bufr.readLine()) != null) {
                i++;
                System.out.println("第" + i + "行:" + s);
            }
            bufr.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
