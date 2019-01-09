/*
    使用System.currentTimeMillis()计算当前时间。
    System.currentTimeMillis()可以返回当前时间与协调世界时1970年1月1日午夜之间的时间
 */

class Demo26 {
    public static void main(String[] args){
        //把1970年1月1日午夜到两个毫秒数保存到一个变量中
        long sumMillis = System.currentTimeMillis();

        //总的秒数
        long sumSeconds = sumMillis / 1000;
        //当前的秒数
        long currentSecond = sumSeconds % 60;

        //总的分钟数
        long sumMinutes = sumSeconds % 60;
        //当前的分钟数
        long currentMinutes = sumMinutes % 60;

        //总的小时数
        long sumHours = sumMinutes % 60;
        //当前的小时数
        long currentHour = sumHours % 24;

        //计算北京时间
        long beiJingHour = (currentHour + 8) % 24;

        System.out.println( beiJingHour + ":" + currentMinutes + ":" + currentSecond  );
    }
}
