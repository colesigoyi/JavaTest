/*
把一个数组进行逆序
 */
class Demo81 {
    public static void main(String[] args) {
        int []data = {23, 45, 56, 66, 76, 54, 34, 323, 78};

        for(int i=0; i<=data.length/2; i++){
            int t = data[i];
            data[i] = data[data.length-1-i];
            data[data.length-1-i] = t;
        }
        for( int x : data){
            System.out.println( x );
        }
    }
}
