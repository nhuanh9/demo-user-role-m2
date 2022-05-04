package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File roleFile = new File("role.csv");
        roleFile.createNewFile();
        File userFile = new File("user.csv");
        userFile.createNewFile();
    }
}
