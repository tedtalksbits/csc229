package com.tedaneblake.homework.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Implementation of the queue data structure using a fixed-length array.
 */
public class MyQueue<E> implements Queue<E> {

    private E[] data;
    private int front = 0;
    private int size = 0;

    public MyQueue() {
        this(10);
    }
    public MyQueue(int capacity) {
        data = (E[]) new Object[capacity]; // unchecked cast
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    public void enqueue(E e) {
        if(size == data.length) throw new IllegalStateException("Queue is full");
        int avail = (front + size) % data.length;
        data[avail] = e;
        size++;
    }

    public E first() {
        if(isEmpty()) return null;
        return data[front];
    }

    /**
     * In developing a robust queue implementation, we allow both the front and back
     * of the queue to drift rightward, with the contents of the queue “wrapping around”
     * the end of an array, as necessary. Assuming that the array has fixed length N, new
     * elements are enqueued toward the “end” of the current queue, progressing from the
     * front to index N −1 and continuing at index 0, then 1. Figure 6.7 illustrates such a
     * queue with first element F and last element R.
     *
     * Q R _ _ _ F G K L M N O P
     * 0 1 2     f             N−1
     * data:
     * Figure 6.7: Modeling a queue with a circular array that wraps around the end.
     * Implementing such a circular view is relatively easy with the modulo operator,
     * denoted with the symbol % in Java. Recall that the modulo operator is computed
     * by taking the remainder after an integral division. For example, 14 divided by 3
     * has a quotient of 4 with remainder 2, that is, 14
     * 3 = 4 2/3
     * 3 . So in Java, 14 / 3 evaluates
     * to the quotient 4, while 14 % 3 evaluates to the remainder 2.
     * The modulo operator is ideal for treating an array circularly. When we dequeue
     * an element and want to “advance” the front index, we use the arithmetic
     * f = ( f +1) % N. As a concrete example, if we have an array of length 10, and a
     * front index 7, we can advance the front by formally computing (7+1) % 10, which
     * is simply 8, as 8 divided by 10 is 0 with a remainder of 8. Similarly, advancing
     * index 8 results in index 9. But when we advance from index 9 (the last one in the
     * array), we compute (9+1) % 10, which evaluates to index 0 (as 10 divided by 10
     * has a remainder of zero).
     * @return
     */
    public E dequeue() {
        if(isEmpty()) return null;
        // get element at the front of the queue
        E answer = data[front];
        data[front] = null; // deference to help garbage collection
        // In most cases, we simply want to increment the index by one, but because
        //of the possibility of a wraparound configuration, we rely on modular arithmetic,
        //computing f = (f+1) % data.length,
        front = (front + 1) % data.length;
        size--;
        return answer;
    }


}
