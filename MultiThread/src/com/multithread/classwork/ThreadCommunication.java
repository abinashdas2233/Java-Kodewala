package com.multithread.classwork;

import java.util.ArrayList;

class Work {
    ArrayList<Integer> al = new ArrayList<>();

    public synchronized void produce(int data) throws InterruptedException {
        while (al.size() != 0) {
            System.out.println("Producer going to wait");
            wait();
        }
        al.add(data);
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while (al.size() == 0) {
            System.out.println("Consumer going to wait");
            wait();
        }
        System.out.println("Consumed: " + al.remove(0));
        notify();
    }
}

public class ThreadCommunication {

    public static void main(String[] args) {

        Work task = new Work();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    task.produce(i);
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    task.consumer();
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
