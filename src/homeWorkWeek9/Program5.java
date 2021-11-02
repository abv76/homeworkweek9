package homeWorkWeek9;

import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list using
Iterator.

 */
public class Program5 {

    public static void main(String[] args) {
        //Create an Arraylist object

        ArrayList arrayList = new ArrayList();

        //Add elements to Arraylist

        arrayList.add("1");
        arrayList.add("5");
        arrayList.add("17");
        arrayList.add("19");
        arrayList.add("41");
        arrayList.add("61");
        arrayList.add("11");
        arrayList.add("23");

        //get an Iterator object for Arraylist using iterator() method
        Iterator itr = arrayList.iterator();

        //use hasNext() and next() methods of Iterator to iterate through the elements.
        System.out.println("Iterating through ArrayList elements...");
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
