package com.tedaneblake.dsa.trees;


/**
 * General Trees Chapter 8
 * Data Structures and Algorithms in Java 6th Edition
 *
 * @param <E>
 */
public abstract class AbstractTree<E> implements GeneralTree<E> {
    public boolean isInternal(Position<E> p) {
        return numChildren(p) > 0;
    }
    public boolean isExternal(Position<E> p) {
        return numChildren(p) == 0;
    }

    public boolean isRoot(Position<E> p) {
        return p == root();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int depth(Position<E> p) {
        if(isRoot(p)) {
            return 0;
        } else {
            return 1 + depth(parent(p));
        }
    }

}
