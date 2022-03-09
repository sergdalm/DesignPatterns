package main.java.com.sergdalm.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> Note.getNote().addNote("Massage from " + Thread.currentThread().getName()));
        Thread thread2 = new Thread(() -> Note.getNote().addNote("Massage from " + Thread.currentThread().getName()));
        Thread thread3 = new Thread(() -> Note.getNote().addNote("Massage from " + Thread.currentThread().getName()));
        Thread thread4 = new Thread(() -> Note.getNote().addNote("Massage from " + Thread.currentThread().getName()));
        Thread thread5 = new Thread(() -> Note.getNote().addNote("Massage from " + Thread.currentThread().getName()));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

        Note.getNote().showNote();
    }
}
