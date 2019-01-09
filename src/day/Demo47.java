/*
    在屏幕上打印1~100之间的所有数
    遍历：就是一次访问某个集合中所有的数
    遍历1~100之间所有的数，打印到屏幕上
 */
class Demo47 {
    public static void main(String[] args) {
        int num = 1;
        while ( num <= 100 ){
            System.out.println( num );
            num++;
        }
    }
}
