package com.company.manage;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class ManageUser implements GeneralManage<User> {
    List<User> userList = new ArrayList<>();
    @Override
    public void add(User user) {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void findAll() {

    }
}
