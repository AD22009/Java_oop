public class SynchronizedExample {
    private static int number = 0;
    
    public static void main(String[] args) {
        PrintNumbersThread thread1 = new PrintNumbersThread();
        PrintNumbersThread thread2 = new PrintNumbersThread();
        thread1.start();
        thread2.start();
    }
    
    static class PrintNumbersThread extends Thread {
        @Override
        public void run() {
            synchronized (SynchronizedExample.class) {
                for (int i = 0; i < 5; i++) {
                    while (number % 5 != 0) {
                        try {
                            SynchronizedExample.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    number += 5;
                    System.out.println(number);
                    SynchronizedExample.class.notifyAll();
                }
            }
        }
    }
}