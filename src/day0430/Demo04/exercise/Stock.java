package day0430.Demo04.exercise;
/*
写一个股票类Stock，包括：一个名为symbol的字符串字段表示股票代码
一个name字段表示股票名称，一个previousPrice的double类型字段表示前一天的股值
一个currentPrice的字段表示当前的股价，创建构造方法
创建getChangePercent()方法返回股票变化的百分比
 */
public class Stock {
    String stockCode;           //股票代码
    String name;
    double previousPrice;       //前一天股值
    double currentPrice;        //当前股值

    public double getChangePrecent() {
        return (currentPrice-previousPrice) / previousPrice;
    }

    public void showInfo() {
        System.out.println("--------股票信息--------");
        System.out.println("\t股票代码：" + stockCode);
        System.out.println("\t股票名称：" + name);
        System.out.println("\t前一天股值：" + previousPrice);
        System.out.println("\t当前股值：" + currentPrice);
        System.out.printf("\t涨跌百分比：" + getChangePrecent());
    }
}
