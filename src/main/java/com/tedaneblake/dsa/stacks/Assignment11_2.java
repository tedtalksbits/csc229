package com.tedaneblake.dsa.stacks;

import com.tedaneblake.dsa.queues.MyQueue;
import com.tedaneblake.dsa.stacks.MyStack;
/**
 *  @author: Tedane Blake
 *  @since : 2023/11/15
 * @version : 1.0
 *
 */
public class Assignment11_2 {
   /**
     *  * Populate a queue with integers. Copy the queue into a stack such that this first element of the queue at the top of the stack.
     *  Maintain the order of the integers in the original queue integers is maintained. The algorithm should also eliminate any values greater than 100.
     * @param queue queue
     * @return stack
     */
    public static MyStack<Integer> queueToStack(MyQueue<Integer> queue) {

        MyStack<Integer> stack = new MyStack<>();
        MyQueue<Integer> tempQueue = new MyQueue<>(queue.size());

        while (!queue.isEmpty()) {
            Integer el = queue.dequeue();
            if(el <= 100) {
                stack.push(el);
            }
            tempQueue.enqueue(el);
        }

        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }

        return stack;
    }

    /**
     * Populate a stack with integers. Remove all values from the stack greater than 100. Do not alter the order of the other elements in the stack.
     * @param stack
     * @return stack
     */

    public static MyStack<Integer> removeIntsGreaterThan100(MyStack<Integer> stack) {
        MyStack<Integer> tempStack = new MyStack<>(stack.size());

        while (!stack.isEmpty()) {
            Integer el = stack.pop();
            if(el <= 100) {
                tempStack.push(el);
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return stack;
    }


    public static void main(String[] args) {
//        MyQueue<Integer> queue = new MyQueue<>(3);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        System.out.println(queue);
//
//        MyStack<Integer> result = queueToStack(queue);
//        System.out.println(result);

        /*
         Populate a stack with integers. Remove all values from the stack greater than 100. Do not alter the order of the other elements in the stack.
         */

        MyStack<Integer> stack = new MyStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        MyStack<Integer> result = removeIntsGreaterThan100(stack);

        System.out.println(result);



    }
}
