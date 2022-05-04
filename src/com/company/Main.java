package com.company;

import com.company.file.FileRoleCSV;
import com.company.file.FileUserCSV;
import com.company.manage.ManageRole;
import com.company.manage.ManageUser;
import com.company.model.Role;
import com.company.model.User;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ManageUser manageUser = new ManageUser();
        ManageRole manageRole = new ManageRole();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Đăng nhập!");
            System.out.println("2. Đăng ký!");
            System.out.println("Nhập vào lựa chọn!");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Đăng nhập");
                    break;
                case 2:
                    System.out.println("Đăng Ký");
                    System.out.println("Nhập vào id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập vào usn: ");
                    String username = scanner.nextLine();
                    System.out.println("Nhập vào usn: ");
                    String password = scanner.nextLine();
                    String status = "1";
                    System.out.println("Nhập vào id role: ");
                    manageRole.findAll();
                    int idRole = scanner.nextInt();
                    Role role = manageRole.findById(idRole);
                    User user = new User(id, username, password, role, status);
                    manageUser.add(user);
                    FileUserCSV.writeToFile(manageUser.getUserList());
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
