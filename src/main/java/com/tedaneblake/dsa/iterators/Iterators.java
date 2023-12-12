package com.tedaneblake.dsa.iterators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterators {

    static boolean isValidFileName(String fileName) {
        if(fileName == null) return false;
        return fileName.contains(".txt") && fileName.contains(".md");
    }

    static void createFile(String fileName) {
        try{
            File newFile =new File("src/main/resources/"+ fileName);
            if(newFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating a new file");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> list = new ArrayList<>();

        // get user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the name of the file?");
        String userFileName = userInput.nextLine();
        // get/create file using user input
        File file = new File("src/main/resources/"+userFileName);
        Scanner scanner = new Scanner(file);
        // read content of file, add values to array
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            list.add(Integer.valueOf(line));
        }
        // print values of array using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("num = "+iterator.next());
        }




    }
}
