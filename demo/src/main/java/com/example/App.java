package com.example;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("Honda", "Accord", 2019);
        // print car and recall info
        System.out.println(c1);
        // create a duplicate car object to print the recall info in a table
        Car c2 = c1.getCopy();
        RecallViewer rv = new RecallViewer(c2);
        rv.printTableView();
    }
}
