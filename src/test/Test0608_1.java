package test;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-08 12:48
 * @ desc: 继承的应用示例
 **/

public class Test0608_1 {
    public static void main(String[] args) {
        SortCosmeticManager cm = new SortCosmeticManager();
        cm.add(new Cosmetic("香奈儿","进口",1000));
        cm.add(new Cosmetic("圣罗兰","进口",800));
        cm.add(new Cosmetic("大宝","国产",20));
        cm.add(new Cosmetic("万紫千红","国产",15));

        cm.printInfo();
        System.out.println("------------------------------------");
        ImportCosmeticManager cm2 = new ImportCosmeticManager();
        cm2.add(new Cosmetic("香奈儿","进口",1000));
        cm2.add(new Cosmetic("圣罗兰","进口",800));
        cm2.add(new Cosmetic("大宝","国产",20));
        cm2.add(new Cosmetic("万紫千红","国产",15));
        cm2.printInfo();

    }
}
//可输出进口化妆品的管理类
class ImportCosmeticManager extends CosmeticManager{
    public void printInfo(){
        for(int i=0; i<count; i++){
            //比较两个字符串的值是否相等，不能使用==，要使用equals()
            if("进口".equals(cs[i].getType())){
                System.out.println(cs[i].getInfo());
            }
        }
    }

}
//排序类:按照商品单价排序
class SortCosmeticManager extends CosmeticManager{
    //排序输出所有产品
    public void printInfo(){
        Cosmetic[] temp = Arrays.copyOf(cs,count);
        Cosmetic c = null;

        for(int i=0; i<temp.length-1; i++){
            for(int j=0; j<temp.length-1-i; j++){
                if(temp[j].getPrice()>temp[j+1].getPrice()){
                    c = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = c;
                }
            }
        }
        for(Cosmetic cosmetic : temp)
            System.out.println(cosmetic.getInfo());
    }
}
//化妆品管理类
class CosmeticManager{
    protected Cosmetic[] cs = new Cosmetic[4];
    protected int count = 0;
    //进货功能
    public void add(Cosmetic c){
        int size = cs.length;
        if(count >= size){
            int newLen = size * 2;
            cs = Arrays.copyOf(cs, newLen);
        }
        cs[count] = c;
        count++;
    }

    public void printInfo(){
        for(int i=0; i<count; i++){
            System.out.println(cs[i].getInfo());
        }
    }


}
//化妆品类
class Cosmetic{
    private String name;//品牌
    private String type;//进口或国产
    private int price;//单价

    public Cosmetic(){}

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo(){
        return "name=" + name + ",type=" + type + ",price=" + price;
    }
}
