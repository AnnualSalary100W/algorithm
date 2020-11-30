package handwritten;

public class DeadLockDemo {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }
    private void deadLock(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("thread1 get lock1");
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("thread1 get lock2");
                    }
                }
                System.out.println("thread1 end");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("thread2 get lock2");
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("thread2 get lock1");
                    }
                }
                System.out.println("thread2 end");
            }
        });
        t1.start();
        t2.start();
    }
}
