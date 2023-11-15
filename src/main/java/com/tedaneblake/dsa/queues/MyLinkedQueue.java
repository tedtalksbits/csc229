package com.tedaneblake.dsa.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedQueue<E> implements Queue<E> {

    private LinkedList<E> list = new LinkedList<>();
    public E first( ) { return list.getFirst(); }
    public E dequeue() {
        return list.removeFirst();
    }
    public void enqueue(E e) {
        list.addLast(e);
    }
    /*

    * C-6.29 -
    *   Implement a method with signature concatenate(LinkedQueue<E> Q2) for the
        LinkedQueue<E> class that takes all elements of Q2 and appends them to the
        end of the original queue. The operation should run in O(1) time and should
        result in Q2 being an empty queue
    *
    * */


    public void concatenate(MyLinkedQueue<E> Q2){
        while (!Q2.isEmpty()){
            enqueue(Q2.dequeue());
        }
    }
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
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

    public static void main(String[] args) {
        MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();
        MyLinkedQueue<Integer> q2 = new MyLinkedQueue<>();
        q2.enqueue(99);
        q2.enqueue(77);
        q2.enqueue(79);
        System.out.println(myLinkedQueue.size());
        myLinkedQueue.enqueue(4);
        myLinkedQueue.enqueue(5);
        myLinkedQueue.enqueue(6);
        System.out.println(myLinkedQueue.first());
        System.out.println(myLinkedQueue.size());

        myLinkedQueue.concatenate(q2);

        System.out.println(myLinkedQueue.size());
    }
}
