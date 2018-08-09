package com.yigelusu.threadTest;

/**
 *〈一句话功能简述〉<br>
 *〈串行与并发的速度对比测试〉
 *
 * @author 一个鲁肃
 * @create 2018/8/8
 * @since 1.0.0
 */
public class ConcurrencyTest {

    private static final long COUNT = 10000000000L;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    /**
     * 功能描述: <br>
     * 〈用于计算并行的时间〉
     * @since: 1.0.0
     * @Author:一个鲁肃
     * @Date: 2018/8/8 18:02
     */
    public static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < COUNT; i++){
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < COUNT; i++) {
            b--;
        }
        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("concurrency: " + time + "ms,b=" + b);
    }


    /**
     * 功能描述: <br>
     * 〈用于计算串行的时间〉
     * @since: 1.0.0
     * @Author:一个鲁肃
     * @Date: 2018/8/8 18:12
     */
    public static void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < COUNT; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < COUNT; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial: " + time + "ms,b=" + b + ",a=" + a);
    }

}
