package com.ercan.InterfaceSegregation;

public interface UserDataOperation<E> {
    void read(E e);

    void write(E e);
}
