import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        System.out.println("hello from Main method");

        Employee emp1 = new Employee(100, "Jack");
        Employee emp2 = new Employee(100, "Jack");
        Test t=new Test();


        // 1 st step to check use of equal method

        boolean result = emp1.equals(emp2);


        System.out.println(result); //false, but it is true so need to override equals method of Object class
        System.out.println(t.equals(emp1)); //this worked
        //System.out.println(emp1.equals(t)); // execution fail classcastexcetion

        //2nd step to check use of hashcode method overriding

        Set<Employee> empSet = new HashSet<>();
        empSet.add(emp1);
        empSet.add(emp2);

        System.out.println("size of employee set " +empSet.size()); //2 








    }


}

