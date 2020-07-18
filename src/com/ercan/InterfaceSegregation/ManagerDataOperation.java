package com.ercan.InterfaceSegregation;

public interface ManagerDataOperation<E> {

    void update(E e);

    void delete(E e);
}
