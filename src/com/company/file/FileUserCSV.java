package com.company.file;

import com.company.manage.ManageRole;
import com.company.model.Role;
import com.company.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUserCSV {

    public static List<User> readFromFile() throws FileNotFoundException {
        ManageRole manageRole = new ManageRole();
        File roleFile = new File("user.csv");
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(roleFile);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            } else {
                String arr[] = line.split(",");
                Role role = manageRole.findById(Integer.valueOf(arr[3]));
                User user = new User(Integer.valueOf(arr[0]), arr[1], arr[2], role, arr[4]);
                users.add(user);
            }
        }
        return users;
    }

    public static void writeToFile(List<User> list) throws FileNotFoundException {
        File roleFile = new File("role.csv");
        PrintWriter printWriter = new PrintWriter(roleFile);
        for ( int i=0; i< list.size(); i++) {
            printWriter.print(list.get(i));
        }
        printWriter.close();
    }
}
