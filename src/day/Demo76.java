//在内层循环中中断外层循环

class Demo76 {
    public static void main(String[] args) {

        for( int x=1; x <= 10; x++){                        //外层循环
            for( int y = 1; y <= 10; y++){                  //内层循环
                if( y >= 5){
                    break;                                  //中断包含他的循环
                }
                System.out.println("x==" + x + ",y==" + y);
            }
        }
        System.out.println("-----------------------");
        //在内层循环中中断外层循环
        outer:                                          //定义一个标签
        for( int x=1; x <= 10; x++){                    //外层循环
            for( int y = 1; y <= 10; y++){              //内层循环
                if( y >= 5){
                    break outer;                        //中断包含他的循环
                }
                System.out.println("x==" + x + ",y==" + y);
            }
        }
    }
}
