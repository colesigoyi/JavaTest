package day0107;

import java.util.concurrent.*;
import java.util.concurrent.FutureTask;

/**
 * @author taoxuefeng
 * @create 2019-01-07 15:22
 * @desc java多线程开启新线程三种方法
 **/

public class ThreadTest {
    public static void main(String[] args) {

        //将ThreadNew实例作为参数实例化Thread之后start启动线程
        new Thread(new ThreadNew()).start();
        System.out.println(" 将ThreadNew实例作为参数实例化Thread之后start启动线程 ");

        new ThreadNew2().start();
        System.out.println(" 实现Runnable接口并在方法run里定义任务 ");

        FutureTask<String> futureTask = new FutureTask<>(new ThreadNew3());
        new Thread(futureTask).start();
        System.out.println(" 实现接口Callable并在call()方法里定义任务 ");
        try {
            System.out.println("执行结果是 " + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
// 实现Runnable接口并在方法run里定义任务
class ThreadNew implements Runnable {

    @Override
    public void run() {
        try { // 延时0.5秒
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Thread New ");
    }
}

class ThreadNew2 extends Thread {

    @Override
    public void run() {
        try { // 延时0.5秒
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Thread New2 ");
    }
}
// 实现接口Callable并在call()方法里定义任务
class ThreadNew3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        try { // 延时0.5秒
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Thread New3 ");

        return "Thread New3 Result";
    }
}
