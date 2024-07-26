package com.task4;

import java.util.TreeMap;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(103, "Karthi");
        employeeMap.put(101, "Rohith");
        employeeMap.put(102, "Naveen");
        employeeMap.put(104, "Venkat");
        System.out.println("Employee names in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}
