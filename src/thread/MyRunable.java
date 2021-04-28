package thread;

public class MyRunable {
    public static void main(String[]args){
        //创建任务类
        MyRunable1 myRunable1 = new MyRunable1();
        //创建线程，并传入任务
        Thread thread = new Thread(myRunable1);
        Thread thread1 = new Thread(myRunable1);
        //启动线程并去执行任务
        thread.start();
        thread1.start();
    }
}

//任务类
class MyRunable1 implements Runnable{
    //覆盖run（）方法
    @Override
    public void run() {
        for (int i = 1; i <=50 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}