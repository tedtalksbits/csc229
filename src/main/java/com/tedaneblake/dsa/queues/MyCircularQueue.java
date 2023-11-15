package com.tedaneblake.dsa.queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCircularQueue {
    private int p_front;
    private int p_rear;
    private int size;
    private int[] data;
    public MyCircularQueue(int k) {
        size = 0;
        data = new int[k];
        p_front = 0;
        p_rear = 0;

    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        int avail = (p_front + size) % data.length;
        System.out.println("available index = " + avail);
        data[avail] = value;
        size++;
        p_rear = avail;
        System.out.println("--------added element " + value + " --------");
        System.out.println(Arrays.toString(data));
        System.out.println("front pointer =" + p_front);
        System.out.println("rear pointer =" + p_rear);
        System.out.println("size of queue = " + size);
        System.out.println("queue is full: " + isFull());
        return true;
    }

    public boolean deQueue() {
       if(isEmpty()) return false;
       data[p_front] = -9999;
       p_front = (p_front + 1) % data.length;
       size--;
       return true;
    }

    public int Front() {
        return data[p_front];
    }

    public int Rear() {
        return data[p_rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) throws Exception {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        System.out.println(myCircularQueue.Rear());     // return 3
        System.out.println(myCircularQueue.isFull());   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        System.out.println(myCircularQueue.Rear());     // return 4

    }
}
