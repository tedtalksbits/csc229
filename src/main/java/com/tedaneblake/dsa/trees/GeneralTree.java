package com.tedaneblake.dsa.trees;

import java.util.Iterator;
/**
 * General Trees Chapter 8
 * Data Structures and Algorithms in Java 6th Edition
 *
 * @param <E>
 */
public interface GeneralTree<E> extends Iterable<E> {
    Position<E> root();
    Position<E> parent(Position<E> p) throws IllegalArgumentException;
    Iterable<Position<E>> children(Position<E>p) throws IllegalArgumentException;

    int numChildren(Position<E> p) throws IllegalArgumentException;
    boolean isInternal(Position<E> p) throws IllegalArgumentException;
    boolean isExternal(Position<E> p) throws IllegalArgumentException;
    boolean isRoot(Position<E> p) throws IllegalArgumentException;
    int size( );
    boolean isEmpty( );
    Iterator<E> iterator( );
    Iterable<Position<E>> positions( );

}
