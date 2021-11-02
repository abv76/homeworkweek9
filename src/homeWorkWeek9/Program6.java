package homeWorkWeek9;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Program6 {


    public static void main(String[] args) {
        //Create a list and add some elements to the list
        List<String> list= new ArrayList<String>();
        list.add("London");
        list.add("Bombay");
        list.add("Paris");
        list.add("Italy");
        list.add("Scotland");
        list.add("Amsterdam");
        list.add("Wales");
        list.add("Cardiff");

        // Print the list
        System.out.println(list);

        //Retrieve the first and third element

        String element = list.get(0);
        System.out.println(element);
        element = list.get(3);
        System.out.println(element);

    }
}
