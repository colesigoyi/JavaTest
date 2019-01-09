/*
    do{
        循环体
    }while (条件);
 */
class Demo55 {
    public static void main(String[] args) {
        //打印10次"动力节点，口口相传的java黄埔军校"
        int count = 1;          //计数器变量
        do{
            System.out.println("第" + count + "次打印：动力节点，口口相传的java黄埔军校");
            count++;
        }while (count < 11);

        //遍历1~100之间所有的数，打印能被7整除的数
        int num = 1;            //保存遍历的数
        count = 0;              //统计打印个数的计数器变量
        do{
            if( num % 7 == 0){
                System.out.print( num + "\t");
                count++;
                if(count % 5 == 0)
                    System.out.println();
            }
            num++;
        }while(num <= 100);

        //计算100到200之间所有偶数的和
        num = 100;
        int sum = 0;
        do{
            if( num % 2 == 0 ){
                sum += num;
            }
            num++;
        }while(num <= 200);
        System.out.println( sum );

        //计算100到200之间所有偶数的和
        num = 100;
        sum = 0;
        do{
            sum += num;
            num = num + 2;
        }while( num <= 200);
            System.out.println( sum );

        System.out.println("结束");
    }
}
