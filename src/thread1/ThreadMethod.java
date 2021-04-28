package thread1;

public class ThreadMethod {
    public static void main(String[]args){
        try {
            //让当前线程睡眠几秒
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());
        t1.start();
        t2.start();
    }
}


class Task1 implements  Runnable{

    @Override
    public void run() {
        for (int i = 1; i <1000 ; i++) {
            System.out.println("Task1:"+i);
            if (i%10==0){
                //结束当前执行的线程，进入就绪状态
                Thread.yield();
            }
        }
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <1000 ; i++) {
            System.out.println("Task2:"+i);
        }
    }
}