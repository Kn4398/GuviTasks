package com.task4;

import java.util.ArrayList;
import java.util.List;

public class ListToArraySample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Karthi");
        stringList.add("Naveen");
        stringList.add("Rohith");
        stringList.add("Venkat");
        System.out.println("List: " + stringList);
        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("Array:");
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
