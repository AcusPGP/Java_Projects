package oop.singlelinkedlist;

import oop.Worker;

public class MainApp {

    LinkedList listStudent;

    public MainApp() {
        listStudent = new LinkedList();
        Worker worker = new Worker();
        worker.setName("Nguyen Van A");
        LinkedList.insert(listStudent, worker);

        worker = new Worker();
        worker.setName("Nguyen Van B");
        LinkedList.insert(listStudent, worker);
    }

    public static void main(String[] args) {

    }
}
