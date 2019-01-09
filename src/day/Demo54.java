/*
continue结束本次循环，继续下次循环
 */
class Demo54 {
    public static void main(String[] args) {
        int num = 0;
        while( num < 10 ){
            num++;
            //continue结束本次循环，继续下次循环，
            if(num >= 5){
                continue;           //如果执行了continue就相当于循环体执行完毕，转到判断循环条件
            }
            System.out.println("num ==" + num);
        }

        System.out.println("循环执行完毕，num==" + num);
    }
}
