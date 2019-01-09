package day0429;
/*
兔子繁殖
有一对兔子，从第三个月开始繁殖，每个月都生一对兔子，新生的兔子也是从第三个月开始，每个月生一对，问第n个月有多少对兔子
月       兔子的数量
1       1
2       1
3       1+1
4       2+1
5       3+2
6       5+3
7       8+5
 */
class Demo01 {
    public static void main(String[] args) {
        for(int month=1;month<=12;month++) {
            System.out.println("月份：" + month +",兔子数：" + fabonacci(month));
        }
        System.out.println();
    }

    public static int fabonacci(int m) {
        if(m==1 || m==2) {
            return 1;
        }else{
            return fabonacci(m-1) + fabonacci(m-2);
        }
    }
}
