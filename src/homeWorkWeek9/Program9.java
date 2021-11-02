package homeWorkWeek9;

import java.util.HashMap;

/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

 */
public class Program9 {

    public static void main(String[] args) {

        // Create a HashMap object called people

        HashMap<String,Integer>people = new HashMap< String,Integer>();

        //Add keys and values (Name, Age)
        people.put("Alex", 23);
        people.put("Sara", 40);
        people.put("Aron", 33);
        people.put("Darren", 53);
        people.put("Louise", 22);
        people.put("Patrick", 56);

       // for each loop
        for (String i: people.keySet()){
            System.out.println( i+ " Age: "+people.get(i));
        }


    }
}
