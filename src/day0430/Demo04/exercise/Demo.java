package day0430.Demo04.exercise;

class Demo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.currentPrice = 100;
        stock.name = "阿里巴巴";
        stock.previousPrice = 98;
        stock.stockCode = "666999";

        stock.showInfo();

    }
}
