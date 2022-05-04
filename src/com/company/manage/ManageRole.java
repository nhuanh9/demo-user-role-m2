package com.company.manage;

import com.company.model.Role;
import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class ManageRole implements GeneralManage<Role> {
    List<Role> roleList = new ArrayList<>();
    @Override
    public void add(Role role) {

    }

    @Override
    public Role findById(int id) {
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
