package test.com.qf.NIO;

import java.nio.ByteBuffer;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 18:55
 * @ desc: NIO
 **/

public class NIODemo {

    private static ByteBuffer buf;

    public static void main(String[] args) {
        //创建一个字节缓冲区，申请内存空间为8字节
        buf = ByteBuffer.allocate(8);

        System.out.println("position=" + buf.position());   //position=0
        System.out.println("limmit=" + buf.limit());        //limmit=8
        System.out.println("capacity=" + buf.capacity());   //capacity=8


        //向缓冲区中写入数据
        buf.put((byte)10);
        buf.put((byte)20);
        buf.put((byte)30);
        buf.put((byte)40);

        System.out.println("-----------------------------");
        System.out.println("position=" + buf.position());   //position=4
        System.out.println("limmit=" + buf.limit());        //limmit=8
        System.out.println("capacity=" + buf.capacity());   //capacity=8

        //缓冲区反转
        buf.flip();
        System.out.println("-----------------------------");
        System.out.println("position=" + buf.position());   //position=0
        System.out.println("limmit=" + buf.limit());        //limmit=4
        System.out.println("capacity=" + buf.capacity());   //capacity=8

        //告知在当前位置和限制之间是否有元素
        if(buf.hasRemaining()){
            //返回当前位置与限制位置之间的元素数
            for(int i=0; i<buf.remaining(); i++){
                byte b = buf.get(i);
                System.out.println(b);
            }
        }
        System.out.println("-----------------------------");
        System.out.println("position=" + buf.position());   //position=0
        System.out.println("limmit=" + buf.limit());        //limmit=4
        System.out.println("capacity=" + buf.capacity());   //capacity=8
    }
}
