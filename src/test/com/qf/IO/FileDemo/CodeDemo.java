package test.com.qf.IO.FileDemo;

import java.io.UnsupportedEncodingException;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 17:15
 * @ desc:
 **/

public class CodeDemo {
    public static void main(String[] args) {

        //通常产生乱发的情况是两个不兼容的编码相互转换
        String info = "中文编码";//gb2312
        try {
            String newInfo = new String(info.getBytes("gb2312"),"iso8859-1");
            System.out.println(newInfo);
            String newInfo2 = new String(newInfo.getBytes("iso8859-1"),"gb2312");
            System.out.println(newInfo2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
