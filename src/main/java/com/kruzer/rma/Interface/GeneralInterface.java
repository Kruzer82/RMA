package com.kruzer.rma.Interface;

//              CRUD
//  Create  Read    Update  Delete

public interface GeneralInterface<T> {
    T create(T t);
    T read(int id);
    T update(T t);
    T delete(int id);
    T delete(T t);
}
