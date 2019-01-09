/*
某个公司采用公用电话传递数据，数据是思维的整数，在传递过程中是加密的，加密规则
如下：每位数字加上5，然后用和除以10的余数代替该数字，再将第一位与第四位交换
第二位与第三位交换
 */

class Demo80 {
    public static void main(String[] args) {
        int [] data = {3,5,1,8};

        //每位数字加上5，然后用和除以10的余数代替该数字
        for(int i=0; i<data.length; i++){
            data[i] = (data[i] + 5)%10;
        }

        //第一位与第四位交换,第二位与第三位交换
        /*
        int t = data[0];
        data[0] = data[3];
        data[3] = t;

        t = data[1];
        data[1] = data[2];
        data[2] = t;
        */
        for(int i=0; i<=1; i++){
            int t = data[i];
            data[i] = data[data.length-1-i];
            data[data.length-1-i] = t;
        }

        for(int x : data){
            System.out.print( x );
        }
    }
}
