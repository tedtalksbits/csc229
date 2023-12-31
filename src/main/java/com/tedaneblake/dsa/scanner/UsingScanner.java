package com.tedaneblake.dsa.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingScanner {


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/input.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
