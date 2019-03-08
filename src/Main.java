import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * @author LM_Code
 * @create 2019-03-08-19:35
 */
//测试
public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(100);
        Productor p=new Productor(queue);
        Consumer c1=new Consumer(queue);
        Consumer c2=new Consumer(queue);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}