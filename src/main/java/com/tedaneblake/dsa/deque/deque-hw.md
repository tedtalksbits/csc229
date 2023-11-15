What values are returned during the following sequence of deque ADT
operations, on an initially empty deque? 
addFirst(3), [3]
addLast(8), [3,8] 
addLast(9), [3,8,9]
addFirst(1), [1,3,8,9]
last( ), 9
isEmpty( ), false 
addFirst(2), [2,1,3,8,9]
removeLast( ), [2,1,3,8]
addLast(7), [2,1,3,8,7]
first( ), 2
last( ), 7
addLast(4), [2,1,3,8,7,4] 
size( ), 6
removeFirst( ), [1,3,8,7,4] 
removeFirst( ). [3,8,7,4]

ANSWER: [3,8,7,4]

Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this
order. Suppose further that you have an initially empty queue Q. Give a code
fragment that uses only D and Q (and no other variables) and results in D storing
the elements in the order (1,2,3,5,4,6,7,8).

ANSWER:
while(!D.isEmpty()){
    Q.enqueue(D.removeFirst());
}

Repeat the previous problem using the deque D and an initially empty stack S.

ANSWER:
while(!D.isEmpty()){
    S.push(D.removeFirst());
}