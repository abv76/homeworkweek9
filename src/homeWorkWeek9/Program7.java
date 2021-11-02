package homeWorkWeek9;
/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names

 */

import java.util.ArrayList;

public class Program7 {
    // Main method
    public static void main(String[] args) {

        // Array list String type
        ArrayList<String> tubename = new ArrayList<String>();
        tubename.add("Bakerloo");
        tubename.add("Central");
        tubename.add("Circle");
        tubename.add("District");
        tubename.add("Hammersmith & City");
        tubename.add("Jubilee");
        tubename.add("Metropolitan");
        tubename.add("Northen");
        tubename.add("Piccadilly");
        tubename.add("Victoria");
        tubename.add("Waterloo & City");
        System.out.println("Original array list:" + tubename);

        System.out.println("Checking the above array list is empty or not! " + tubename.isEmpty());

        tubename.removeAll(tubename);             // removeAll method for Array

        System.out.println("Array list after remove elements " + tubename);

        System.out.println("Checking the above array list is empty or not! " + tubename.isEmpty());   //String method to chech it is empty

    }


}
