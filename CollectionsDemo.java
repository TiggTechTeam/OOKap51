/*************************************************** 
Class CollectionsDemo: simple class for demonstrating
  basic collection operations / methods

UV Objektorientierte Programmierung / H.Hagenauer
***************************************************/

import java.util.*;  //import from package java.util

public class CollectionsDemo {

  public static void main (String[]args) {
    
    //List
    System.out.println("interface List<E>");
    ArrayList<String> sList = new ArrayList<>();
    sList.add("ArrayList");
    sList.add("LinkedList");
    sList.add("ArrayList");
    sList.add(0, "Collection Classes");
    System.out.println(" slist - Elementanzahl: " + sList.size());
    displayList(sList);
    if (sList.contains("ArrayList"))
      sList.remove("ArrayList");
    displayList(sList);
    
    //Queue
    System.out.println("\ninterface Queue<E>");
    PriorityQueue<Circle> cQueue = new PriorityQueue<>();
    cQueue.add(new Circle(7.7));
    cQueue.add(new Circle(2.5));
    cQueue.add(new Circle(4.0));
    System.out.println(" cQueue - Elementanzahl: " + cQueue.size());
    System.out.println(" cQueue: " + cQueue.toString());
    System.out.println(" Kopfelement entfernen: " + cQueue.remove().toString());
    System.out.println(cQueue.toString());    

    //Set
    System.out.println("\ninterface Set<E>");
    HashSet<String> sSet = new HashSet<>();
    sSet.add("Programming");
    sSet.add("Data Bases");
    sSet.add("Software");
    System.out.println(" sSet: " + sSet.toString());
    sSet.add("Data Bases");
    System.out.println(" sSet: " + sSet.toString());
    System.out.println();
  }
  
  //displaying all elements of data structures implementing the list interface
  public static <E> void displayList(List<E> list){
    for(int i = 0; i < list.size(); i++)
      System.out.println(" " + i + ": " + list.get(i));
    System.out.println();
  }
}
