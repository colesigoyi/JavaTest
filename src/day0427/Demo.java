class ain{
    public static void main(String[] args) {
        System.out.println(getMoney(1));
        System.out.println(getMoney(100));
        System.out.println(getMoney(1000000000));
    }
    public static int getMoney(int num) {
        if(num == 1){
            return 100;
        }
        if(num == 100){
            return 1000;
        }
        if(num == 1000000000){
            return 1001;
        }
        return 0;
    }
}