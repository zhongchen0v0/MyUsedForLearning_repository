package Thread_part1;

import java.util.concurrent.Callable;
/*使用Callable范式中填的是返回的值
* */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
