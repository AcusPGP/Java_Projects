package oop.thread;

public class ThreadExample {

    public static void main(String[] args) {
        ThreadVu t1 = new ThreadVu("S");
        ThreadVu t2 = new ThreadVu("O");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }

}



class ThreadVu implements Runnable {

    String myValue = "";

    ThreadVu(String value) {
        myValue = value;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(myValue + ": " + i);
        }
    }
}
