package day0523;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        /*
        String n = "";
        char[] str = s.toCharArray();
        int num = s.length();
        for(int t =0;t<num;t++){
            n += str[num -1-t];
        }*/
        StringBuffer stringbuffer =new StringBuffer(s).reverse();
        System.out.println(stringbuffer);
    }
}
