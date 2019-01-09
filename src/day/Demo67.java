/*
求1/2 + 3/5 + 5/7 + 7/9 .....+97 / 99的和
 */
class Demo67 {
    public static void main(String[] args) {
        double sum = 0;

        for (int n = 1; n <= 97; n+=2){
            sum += n / (n + 2.0);
        }
        System.out.println(sum);
    }
}
