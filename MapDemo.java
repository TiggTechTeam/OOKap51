/*************************************************** 
Class MapDemo: simple class for demonstrating
  map classes and operations

UV Objektorientierte Programmierung / H.Hagenauer
***************************************************/

import java.util.*;  //import from package java.util

public class MapDemo {

  public static void main (String[] args) {
    
    Map<Integer, String> studList = new HashMap<>();
    studList.put(1010100, "Mustermann");
    studList.put(1020201, "Beispielberger");
    studList.put(1030399, "Vorbildhuber");
    System.out.println("Name: " + studList.get(1020201) + "\n");
    
    Set<Integer> keys = studList.keySet(); //all keys of the map in a set
    for (Integer k: keys)                  //iterating over all keys
      System.out.println(k + " - " + studList.get(k));
    System.out.println();
      
    System.out.println(studList.remove(1020201) + " entfernen");
    System.out.println(studList);

//     System.out.println(studList.remove(1020201) + " entfernen");
//     System.out.println(studList);
  }
}
