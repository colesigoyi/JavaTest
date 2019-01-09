package day0430.exercise;
/*
定义分数类，包括分子，分母两个成员变量，定义显示分数的成员方法，在现实分数时要约分
 */
public class Fraction {
    int numerator;              //分子
    int denominator = 1;        //分母

    public void show() {
        //先对分子和分母进行约分
        getReduction();
        if(denominator == 1){
            System.out.println(numerator);
        }else {
            System.out.println(numerator + "/" + denominator);
        }
    }
    //对分子分母约分
    private void getReduction() {
        //先求公约数
        int gcd = getGcd();
        //分子分母分别除以最大公约数
        numerator /= gcd;
        denominator /= gcd;
    }
    //求两个数的最大公约数
    private int getGcd() {
        //从m/n遍历到1，找到第一个能同时把n和m整除的数
        for(int x=numerator; x>=1; x--){
            if(numerator%x==0 && denominator%x==0){
                return x;
            }
        }
        return 1;
    }
}
