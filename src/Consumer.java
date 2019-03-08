import java.util.concurrent.BlockingQueue;

/**
 * @author LM_Code
 * @create 2019-03-08-19:34
 */
//消费者
public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue q){
        this.queue=q;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);//模拟耗时
                consume(queue.take());
            }catch (InterruptedException e){
            }
        }
    }
    private void consume(Integer n) {
        System.out.println("Thread:" + Thread.currentThread().getId() + " consume:" + n);
    }
}