package com.tedaneblake;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        int n = 5;
        List<String> list = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            list.add("Hello world!");
        }

        System.out.println(list);

        System.out.println(3 % 5 == 0);

    }
}