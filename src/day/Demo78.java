class Demo78 {
    public static void main(String[] args) {
        //1、数据类型 [] 数组名 = new 类型[数组的长度]
        //定义一个数组，存储80个同学成绩
        int [] scoreArr = new int[80];
        /*
            scoreArr是数组名
            ScoreArr的数据类型是 int[]
            new int[80]会在内存中分配一块连续的存储空间，这块存储空间可以连续存储80个int类型数据
         */

        //2、通过索引值（下标）实现给数组的元素进行赋值
        scoreArr[0] = 78;
        scoreArr[1] = 45;
        scoreArr[2] = 23;
        scoreArr[3] = 46;

        //读取数组元素
        System.out.println( scoreArr[0]);
        System.out.println( scoreArr[1]);
        System.out.println( scoreArr[2]);
        System.out.println( scoreArr[3]);
        System.out.println("-----------------");

        //3、通过循环遍历数组的各个元素
        //把数组的前10个元素打印到屏幕上
        for( int i = 0; i <=9; i++){
            System.out.println( scoreArr[i]);
        }
        /*
        4、
        定义了数组之后，系统会给数组的各个元素进行默认的初始化
            对于数值型数据默认初始化为0
            对于布尔型数据默认初始化为false
            对于字符型数据默认初始化为码值为0的字符
            对于引用类型数据默认初始化为null
         */


        //5、定义数组时，房括弧也可以写在数组名后面
        int sgeArr[] = new int[80];  //不建议这么写

        //6、在定义数组的同时，可以给数组的各个元素进行赋值
        int []arr3 = {12,34,45,56,67};
        /*
            定义了一个数组arr3，这个数组的每个元素是12,34,45,56,67
            这个数组的长度就是初始化时指定的数组元素的个数
         */
        //7、数组有一个length属性，表示数组的长度，即数组元素的个数，数组最大下标=长度-1
        System.out.println("-----------------");
        for(int i = 0; i<arr3.length; i++){
            System.out.println( arr3[i]);
        }

        //如果遍历每个集合中所有的数据，除了for循环之外还可以使用foreach循环
        System.out.println("-----------------");
        for( int x : arr3){
            System.out.println( x );
        }
        /*
            依次把arr3数组中的每一个元素赋值给x变量
            在循环体中我们可以对数组的元素进行处理
         */

        //通过循环修改数组的元素值
        for(int i=0; i< arr3.length; i++){
            arr3[i] = i*i;
        }
        System.out.println("-----------------");
        for(int i = 0; i<arr3.length; i++){
            System.out.println( arr3[i]);
        }
        //foreach循环只是用来读取数组的每一个元素，不能用于修改数组的元素值
        for(int x : arr3 ){
            x = 123;
        }
        System.out.println("-----------------");
        for( int x : arr3){
            System.out.println( x );
        }
    }
}
