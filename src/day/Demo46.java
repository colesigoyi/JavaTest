/*
while(条件){
    循环体
}
    确定重复循环的执行代码
    确定循环条件
 */
class Demo46 {
    public static void main(String[] args) {
        int count = 0;                                  //定义一个变量，用来计数

        //count变量用来控制循环的次数，有时也称count为循环的控制变量
        while (count < 10) {
            System.out.println("老婆我爱你");
            count++;                                    //在循环体中需要有修改循环变量的语句
                                                        //否则会产生死循环，control + c停止死循环
            System.out.println("这是第" + count + "次");
        }
    }
}
