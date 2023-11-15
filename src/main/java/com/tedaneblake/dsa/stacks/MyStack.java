package com.tedaneblake.dsa.stacks;

import java.util.ArrayList;
import java.util.List;

public class MyStack <E>{
    private int CAPACITY = 10;
    private final List<E> store = new ArrayList<>(CAPACITY);
    private int TOP_EL_INDEX = -1;

    public MyStack(int capacity) {
        if(capacity > 0) {
            this.CAPACITY = capacity;
        }
    }

    public MyStack() {
        this(10);
    }

    public void push(E element){
        System.out.println("pushing " + element);
        if(TOP_EL_INDEX + 1 == CAPACITY) {
            return;
        }
        TOP_EL_INDEX++;
        store.add(TOP_EL_INDEX, element);
        System.out.println(store);
    }

    public E pop() {
        if(isEmpty()) return null;
        E topEl =  store.get(TOP_EL_INDEX);
        System.out.println("Popping first element" + topEl);
        store.set(TOP_EL_INDEX, null);
        TOP_EL_INDEX--;
        System.out.println(store);
        return topEl;
    }

    public E top() {
        System.out.println(store);
        if(isEmpty()) return null;
        return store.get(TOP_EL_INDEX);
    }

    public int size() {
        return store.size();
    }

    public boolean isEmpty() {
        return TOP_EL_INDEX < 0;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "CAPACITY=" + CAPACITY +
                ", store=" + store +
                ", TOP_EL_INDEX=" + TOP_EL_INDEX +
                '}';
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        myStack.push("5");
        myStack.push("3");
        System.out.println(myStack.size());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.top());
    }





}
