package com.company.file;

import com.company.model.Role;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRoleCSV {
    public static List<Role> readFromFile() throws FileNotFoundException {
        File roleFile = new File("role.csv");
        List<Role> roles = new ArrayList<>();
        Scanner scanner = new Scanner(roleFile);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            } else {
                String arr[] = line.split(",");
                roles.add(new Role(Integer.valueOf(arr[0]), arr[1], arr[2]));
            }
        }
        return roles;
    }

    public static void writeToFile(List<Role> list) throws FileNotFoundException {
        File roleFile = new File("role.csv");
        PrintWriter printWriter = new PrintWriter(roleFile);
        for ( int i=0; i< list.size(); i++) {
            printWriter.print(list.get(i));
        }
        printWriter.close();
    }
}
