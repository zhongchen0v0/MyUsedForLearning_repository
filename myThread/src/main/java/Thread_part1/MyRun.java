package Thread_part1;

public class MyRun implements Runnable{
/*用接口来实现就是接口里面有一个run函数，然后我们将run函数注入进线程对象中
*
* */
    @Override
    public void run() {
        //获取当前正在执行的线程的对象
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName()+":hello world!");
        }
    }
}
