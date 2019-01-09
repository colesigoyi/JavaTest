package day0426;

class Demo03 {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            start();
            stop();
        }
    }
    public static void start(){
        //起步
        System.out.println("++++++++++");
        System.out.println("踩刹车");
        System.out.println("踩离合");
        System.out.println("挂挡");
        System.out.println("松刹车");
        System.out.println("松离合");
        System.out.println("踩油门");
        System.out.println("松手刹");
    }
    public static void stop(){
        //停车
        System.out.println("----------");
        System.out.println("踩离合");
        System.out.println("踩刹车");
        System.out.println("摘挡");
        System.out.println("拉手刹");
        System.out.println("松离合");
        System.out.println("松刹车");
    }
}
