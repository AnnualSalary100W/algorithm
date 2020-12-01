package handwritten.xiaomi;

import handwritten.Singleton;

public class Main5 {
    public static void main(String[] args) {
        System.out.println(SingletonDemo.newInstance());
    }
    public static class SingletonDemo {
        private volatile static SingletonDemo SingletonDemo;
        private  SingletonDemo() {
        }
        public static SingletonDemo newInstance() {
            if (SingletonDemo == null) {
                synchronized (SingletonDemo.class) {
                    if (SingletonDemo == null) {
                        SingletonDemo = new SingletonDemo();
                    }
                }
            }
            return SingletonDemo;
        }
    }
}
