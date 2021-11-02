package homeWorkWeek9;
/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */


//import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program10 {
    // Main method

    public static void main(String[] args) {

        //Map  and Hashmap
        // Create a HashMap object called line

        Map<String, String> line;
        line = new HashMap<>();

        //// Add keys and values (Station, Tube lines)

        line.put("Aldgate", "Metroplolitan ,Circle\n ");
        line.put("Angel", "Northern ");
        line.put("Baker Street", "Metroplolitan ,Circle, Jubilee,Hammersmith & City,Bakerloo\n ");
        line.put("Bank", "Northen ,Central,Waterloo & City\n ");
        line.put("Barbican", "Metroplolitan ,Circle,Hammersmith & City \n ");
        line.put("Bayswater", "Circle, District\n ");
        line.put("Bond Street", "Jubilee ,Central\n ");
        line.put("Borough", "Northern\n ");
        line.put("Cannon Street", "District ,Circle\n ");
        line.put("Covent Garden", "Piccadilly\n ");
        line.put("Embankment", "District, Bakerloo,Northern, Circle\n ");
        line.put("Euston", "Northen, Victoria\n ");
        line.put("Farringdon", "Metroplolitan ,Circle, Hammersmith & City\n ");
        line.put("Green Park", "Piccadilly, Victoria, Jubilee\n ");

        System.out.println("Please enter Zone 1 station name from following list: ");
        System.out.println("Aldgate,Angel,Baker Street,Bank, Barbican, Bayswater");
        System.out.println("Bond Street, Borough, Cannon Street,Covent Garden");
        System.out.println("Embakment, Euston, Farringdon, Green Park");

        Scanner station = new Scanner(System.in);
        String sc = station.nextLine();

        System.out.println("Following lines passing through this station: ");
        System.out.println(line.get(sc));                       //To access a value in the HashMap, use the get() method and refer to its key


    }


}