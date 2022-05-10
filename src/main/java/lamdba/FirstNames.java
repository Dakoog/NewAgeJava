package lamdba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstNames{
    public static void main(String[] args) {
        //sort names by length from the shortest to the longest
        //A comparator is a functional interface that has only one method and needs to be implemented
        List<String> firstNames = new ArrayList<>();
        firstNames.add("Dorota");
        firstNames.add("Zuzanna");
        firstNames.add("Tomasz");
        firstNames.add("Krzysztof");
        firstNames.add("Anna");
        firstNames.add("Andrzej");
        firstNames.add("Iwo");
        firstNames.add("Hermenegilda");

        System.out.println("-----------------  Sorting with lambda --------------------");
        //A lambda expression is a short block of code which takes in parameters and returns a value.
        // Lambda expressions are similar to methods, but they do not need a name
        // and they can be implemented right in the body of a method.
//**************************************************************************************************
        // I. EVOLUTION for sort
        //1. without lambda
        firstNames.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        //2. sort with lambda
        firstNames.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        //3. sort with lambda - the shortest version
        firstNames.sort(Comparator.comparingInt(String::length));
        System.out.println(firstNames);

        //II. REVERSED SORT
        System.out.println("Reversed sort");
        //1. reversed sort with lambda
        firstNames.sort((o1, o2) -> Integer.compare(-o1.length(), o2.length()));
        //2. reversed  sort with lambda - the shortest version
        firstNames.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(firstNames);

        //III. COMPARING and SORTING
        System.out.println("\nComparing names and final sorting:\n-------------------------------- ");
        firstNames.sort((o1, o2) -> {
            System.out.println(o1 + " vs " + o2);
            return Integer.compare(o1.length(), o2.length());
        });
        System.out.println("---------------------------------\nAfter comparing all elements final result:\n"+firstNames);

    }
}
