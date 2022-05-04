package com.company.manage;

import com.company.model.User;

public interface GeneralManage<T> {
    void add(T t);
    T findById(int id);
    void edit(int id, T t);
    void delete(int id);
    void findAll();
    int findIndexById(int id);
}
