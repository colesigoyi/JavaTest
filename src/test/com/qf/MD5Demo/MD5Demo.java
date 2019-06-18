package test.com.qf.MD5Demo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 15:19
 * @ desc: MD5工具类(信息-摘要算法)
 **/

public class MD5Demo {

    private static String savePassword = "pmq7VoTEWWLYh1ZPCDRujQ==";//密文

    public static void main(String[] args) {

        System.out.println(login("admin123456"));
    }

    private static boolean login(String password){
        if(savePassword.equals(md5(password))){
            return true;
        }else {
            return false;
        }
    }
    //计算MD5的工具方法
    private static String md5(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            //通过MD5计算摘要
            byte[] bytes = md.digest(password.getBytes("UTF-8"));
            String str = Base64.getEncoder().encodeToString(bytes);
            return str;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void test() {

        String password = "admin123456";//明文
        String savePassword = "pmq7VoTEWWLYh1ZPCDRujQ==";//秘文

        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            //通过MD5计算摘要
            byte[] bytes = md.digest(password.getBytes("UTF-8"));
            System.out.println(Arrays.toString(bytes));
            //[-90, 106, -69, 86, -124, -60, 89, 98, -40, -121, 86, 79, 8, 52, 110, -115]

            String mdStr = new String(bytes);
            //System.out.println(mdStr);无法还原
            //a-z,A-Z,0-9 / *  这种表示方式是BASE64编码算法
            //JDK1.8版本中，
            //编码
           String str = Base64.getEncoder().encodeToString(bytes);//pmq7VoTEWWLYh1ZPCDRujQ
           System.out.println(str);
           //解码
           byte[] decoder = Base64.getDecoder().decode(str);
           System.out.println(Arrays.toString(decoder));


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
