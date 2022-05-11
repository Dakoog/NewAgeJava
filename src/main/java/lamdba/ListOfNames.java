package lamdba;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {


    private List<String> listOfFirstName() {
        List<String> firstNames = new ArrayList<>();
        firstNames.add("Dorota");
        firstNames.add("Zuzanna");
        firstNames.add("Tomasz");
        firstNames.add("Krzysztof");
        firstNames.add("Anna");
        firstNames.add("Andrzej");
        firstNames.add("Iwo");
        firstNames.add("Hermenegilda");
        return firstNames;
    }

    private List<String> filter(List<String> input, Filter filter) {
        List<String> resultList = new ArrayList<>();
        for (String firstName : input) {
            if (filter.filter(firstName)) {
                resultList.add(firstName);
            }
        }

        return resultList;
    }

    private String modify(String string, Modifier modifier) {
        return modifier.modify(string);

    }

    private void modifyAndDisplayNameList(List<String> firstNames, Modifier modifier) {
        List<String> argsForNames = new ArrayList<>();

        for (String firstName : firstNames) {
            String argsForName = modify(firstName, modifier);
            argsForNames.add(argsForName);
        }
        System.out.println(argsForNames);
    }

   public void firstName() {

        System.out.println("List of names = " + listOfFirstName());
    }

    public void women() {

        List<String> name = listOfFirstName();
        name = filter(name, n -> n.endsWith("a"));
        System.out.println();
        modifyAndDisplayNameList(name, n -> n + " - is female name.\n");
    }

   public void men() {

        List<String> name = listOfFirstName();
        name = filter(name, n -> !n.endsWith("a"));
        System.out.println();
        modifyAndDisplayNameList(name, n -> n + " - is male name.\n");

    }
}
