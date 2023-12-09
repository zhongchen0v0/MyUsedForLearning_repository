package Thread_part1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一种方式：
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.setName("线程一");
//        t2.setName("线程二");
//
//        t1.start();
//        t2.start();

        //第二种方式
//        MyRun myRun = new MyRun();
//
//        Thread t1 = new Thread(myRun);
//        Thread t2 = new Thread(myRun);
//
//        t1.setName("线程一");
//        t2.setName("线程二");
//
//        t1.start();
//        t2.start();
        //第三种方式
        //创建对象接口为Callable
        MyCallable mc = new MyCallable();
        //创建FutureTask管理多线程的结果
        FutureTask<Integer> futureTask = new FutureTask<>(mc);

        Thread t1 = new Thread(futureTask);

        t1.start();

        Integer result = futureTask.get();

        System.out.println(result);

    }
}
