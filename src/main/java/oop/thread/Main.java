package oop.thread;

public class Main {
    public static void main(String[] args) {
        //Tạo ra luồng t1 từ class ThreadFramgia
        ThreadFramgia t1 = new ThreadFramgia();
        t1.start();

        //Tạo ra luồng t2 từ class ThreadFramgia
        ThreadFramgia t2 = new ThreadFramgia();
        t2.start();

        //Tạo ra luồng t3 từ class ThreadFramgia
        ThreadFramgia t3 = new ThreadFramgia();
        t3.start();
    }
}
