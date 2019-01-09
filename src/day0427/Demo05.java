package day0427;

import java.util.Scanner;

/*
把十进制转换为十六进制
 */
class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("十六进制转化结果：" + toHexadecimal( num ));
    }
    public static String toHexadecimal( int num ) {
        String res = "";        //保存十六进制的结果
        while( num!=0 ) {
            int r = num%16;
//          res = r + res;
            res = dToH(r) + res;
            num /= 16;
        }
        return  "0x" + res;
    }
    /*
    把10到15转换为A到F
     */
    public static String dToH(int n) {
        if( n<10 ) {
            return "" + n;
        }
        switch ( n ) {
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            case 15:
                return "f";
        }
        return "";
    }

}
