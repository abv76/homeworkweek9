package homeWorkWeek9;
/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.

 */

import java.util.ArrayList;
import java.util.List;

public class Program4 {

// Main method
    public static void main(String[] args) {
//String Arraylist

        List<String> list= new ArrayList<String>();
       list.add("Red");
       list.add("Black");
       list.add("Blue");
       list.add("Pink");
       list.add("White");
       list.add("Purple");
       list.add("Yellow");
       list.add("Orange");

     // Iterating ArrayList: using Advance for each loop to display the element

       for(String value:list)
           System.out.println(value);


        }

    }

