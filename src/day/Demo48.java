/*
    遍历1~100之间所有的数，把能被3整除的数打印在屏幕上，每行打印5个
 */
class Demo48 {
    public static void main(String[] args) {
        int count = 0;          //计数器变量
        int num = 1;            //比那里100之内多有的数
        while ( num <= 100 ){
            if (num % 3 == 0){
                System.out.print( num + "\t" );
                //每打印一个就需要进行计数，当计数器是5的倍数的时候就需要换行
                count++;
                //判断是否换行
                if ( count % 5 == 0 ){
                    System.out.println();   //换行
                }
            }
            num++;
        }
    }
}