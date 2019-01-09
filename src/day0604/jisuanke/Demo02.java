package day0604.jisuanke;

import java.util.Scanner;

class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1=1;
        long num2=1;
        long numn=1;
        int N = sc.nextInt();
        if(N == 1){
            System.out.println("1");
        }else if( N== 2){
            System.out.println("1");
        }else if(N == 0){
            System.out.println("0");
        } else{
            for (int i = 3; i <= N; i++) {
                numn = num1 + num2;
                num1 = num2;
                num2 = numn;
            }
            System.err.println(numn);
        }
    }
}
//0 1 1 2 3 5 8 13