/*
    验证switch表达式的数据类型
 */
class Demo36 {
    public static void main(String[] args) {
//      int num = 100;
//      byte num = 100;
//      short num = 100;
        char num = 97;
//      long num = 100;     //Error: 不兼容的类型: 从long转换到int可能会有损失


        switch ( num ) {
            case 100:
                System.out.println("100");
            case 'a':
                System.out.println("aaaaaaaa");
        }

        /*
        boolean flag = true;    //Error: 不兼容的类型: boolean无法转换为int
        switch ( flag ) {
            case true:
                System.out.println("true");
                */
        }
    }

