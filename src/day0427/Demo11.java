package day0427;
/*
有5个人坐在一起，问第5个人多少岁，他说比第4个人大2岁，问第4个人岁数，他说比第3个人打2岁
问第3个人，他说比第二个人大两岁，问第二个人，比第一个人大两岁，最后问第一个人，他说10岁，请问第五个人多大？
 */
class Demo11 {
    public static void main(String[] args) {
        System.out.println(getAge(5));
    }

    public static  int getAge( int n ) {
        if(n==1) {
            return 10;
        }
        return getAge(n-1) + 2;
    }

}
