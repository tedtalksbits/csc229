6.1 18
6.2
6.3 What values are returned during the following series of stack operations, if executed
upon an initially empty stack? push(5), push(3), pop(), push(2), push(8),
pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), pop(), push(4),
pop(), pop().

push(5),
stack 5

---

push(3),
stack 5, 3

---

pop(),
stack 5
return 3

---

push(2),
stack 5, 2

---

push(8),
stack 5, 2, 8

---

pop(),
stack 5, 2
return 8

---

pop(),
stack 5

---

push(9),
stack 5, 9

---

push(1),
stack 5, 9, 1

---

pop(),
stack 5, 9
return 1

---

push(7),
stack 5, 9, 7

---

push(6),
stack 5, 9, 7, 6

---

pop(),
stack 5, 9, 7
return 6

---

pop(),
stack 5, 9
return 7

---

push(4),
stack 5, 9, 4

---

pop(),
stack 5, 9
return 4

---

pop().
stack 5
return 9

---

6.4
```java 
    <E> void transferStack(Stack<E> s, Stack<E> t) {
        while(!s.isEmpty()) {
            t.push(S.pop());
        }
    }
```
6.5
```java
    public void emptyStack(Stack<E> s) {
        if(!s.isEmpty()) {
            s.pop();
            emptyStack(s)
        }
    }
```
