R-6.7 - Suppose an initially empty queue Q has performed a total of 32 enqueue operations, 10 first operations, 
and 15 dequeue operations, 5 of which returned null to
indicate an empty queue. What is the current size of Q?


32 - (15 - 5) = answer: **22**

R-6.8 - Had the queue of the previous problem been an instance of the ArrayQueue class,
from Code Fragment 6.10, with capacity 30 never exceeded, what would be the
final value of the instance variable f?

answer: **10**

R-6.9 - What values are returned during the following sequence of queue operations, if
executed on an initially empty queue? enqueue(5), enqueue(3), dequeue(),
enqueue(2), enqueue(8), dequeue(), dequeue(), enqueue(9), enqueue(1),
dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(), enqueue(4),
dequeue(), dequeue()

enqueue(5), [5]
enqueue(3), [5,3]
dequeue(), [3] //5
enqueue(2), [3,2]
enqueue(8), [3,2,8]
dequeue(), [2,8] //3
dequeue(), [8] //2
enqueue(9), [8,9]
enqueue(1),  [8,9,1]
dequeue(), [9,1] //8
enqueue(7), [9,1,7]
enqueue(6), [9,1,7,6]
dequeue(), [1,7,6] //9
dequeue(), [7,6] //1
enqueue(4),[7,6,4]
dequeue(), [6,4] //7
dequeue() [4] //6

answer: **5,3,2,8,9,1,7,6**

C-6.26 - When implementing the ArrayQueue class, we initialized f = 0 (at line 5 of Code
Fragment 6.10). What would happen had we initialized that field to some other
positive value? What if we had initialized it to −1?
if(t>0)
code will work as expected as long as t>=0<CAPACITY
if(t==-1)

answer: 
code will break: Index -1 out of bounds
int avail = (-1 + 0) % 0; // avail = -1
data[avail] = e;


C-6.29 - Implement a method with signature concatenate(LinkedQueue<E> Q2) for the
LinkedQueue<E> class that takes all elements of Q2 and appends them to the
end of the original queue. The operation should run in O(1) time and should
result in Q2 being an empty queue

answer: 
```java
    public void concatenate(MyLinkedQueue<E> Q2){
        while (!Q2.isEmpty()){
            enqueue(Q2.dequeue());
        }
    }
```