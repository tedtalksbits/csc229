package com.tedaneblake.dsa.queues;

import com.tedaneblake.exceptions.DataEmptyException;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple queue using a dynamic array, this implementation is inefficient because we are wasting space when we dequeue an element
 */

public class SimpleQueue {

    // store elements
    private List<Integer> data;
    private  int[] test;

    // pointer to indicate the start position
    private int p_start;

    public SimpleQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
        test = new int[3];
    }

    public void enQueue(int val) {
        data.add(val);

    }

    public int deQueue() {
        if(isEmpty()){
            throw new DataEmptyException("The Queue is empty");
        }
        p_start++;
        return data.get(p_start);
    }

    public int peek() {
        if(isEmpty())  throw new DataEmptyException("The Queue is empty");
        return data.get(p_start);
    }

    private boolean isEmpty() {
        return p_start >= data.size();
    }

    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue();

        simpleQueue.enQueue(45);
        simpleQueue.enQueue(99);
        simpleQueue.enQueue(9999);

        System.out.println(simpleQueue.peek());

        System.out.println(simpleQueue.isEmpty());

        simpleQueue.deQueue();

        System.out.println(simpleQueue.peek());

        simpleQueue.deQueue();
        System.out.println(simpleQueue.peek());

        int[] data = new int[7];

        System.out.println(data.length);

    }
}
