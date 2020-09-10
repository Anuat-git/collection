import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
//import equalsHashcode.Employee;

// you cant order if you have null value in hashset, it throws nullpointexcetion.
// to soring we need to convert set to list and use Collections.sort() method and pass new created list as argument.

public class HashsetClass {

    public static void main(String[] args) {

        Set set = new HashSet<>();

        set.add(123);
        set.add(456);
        set.add(null);
        set.add(null);
        set.add(123);
        set.add(789);
        set.add("Anu");

        System.out.println(set);

        Set<String> setGeneric = new HashSet<>();
        setGeneric.add("Arona");
        setGeneric.add("john");
        //setGeneric.add(null);
        // setGeneric.add(null);
        setGeneric.add("john");

        System.out.println(setGeneric);

        //Set<> setGeneric1 = new HashSet<>();

        // Check if element exists
        boolean check = setGeneric.contains("johnn");
        System.out.println(check);

        //4. Remove an element
        //setGeneric.remove("john");
        // System.out.println(setGeneric);
        System.out.println("set status " + setGeneric.remove("john"));

        setGeneric.add("joseph");
        setGeneric.add("asp");
        setGeneric.add("pltu");

        //check if set is empty and size of the set
        if (setGeneric.isEmpty()) {

            System.out.println("hashset is empty");
        } else {
            System.out.println("hashset has  " + setGeneric.size() + " elements");
        }
        System.out.println(setGeneric);

        //iterate
        for (String sett : setGeneric) {
            System.out.println(sett);

        }

        //sorting using list

        /*List<String> listSort = new ArrayList<String>(setGeneric);
        Collections.sort(listSort);
        System.out.println(listSort);

         */

        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(setGeneric);
        Collections.sort(list);

        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements in sorted order using List: "+ list);

       // Set<Employee> employeset = new HashSet<>();


    }


}

