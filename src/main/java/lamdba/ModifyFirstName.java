package lamdba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ModifyFirstName {

    public static void main(String[] args) {

        new ModifyFirstName().listOfFirstName();
        new ModifyFirstName().women();



    }
    //--------------------------------------------------------------------------------------------------------
    private List<String> filter(List<String> input, Filter filter){
        List<String> resultList = new ArrayList<>();
        for (String firstName : input) {
            if(filter.filter(firstName)){
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
    private List<String > listOfFirstName(){
        List<String> firstNames = new ArrayList<>();
        firstNames.add("Dorota");
        firstNames.add("Zuzanna");
        firstNames.add("Tomasz");
        firstNames.add("Krzysztof");
        firstNames.add("Anna");
        firstNames.add("Andrzej");
        firstNames.add("Iwo");
        firstNames.add("Hermenegilda");
        System.out.println("This is name list.");
        return firstNames;
    }
    private void firstName(){
        System.out.println();
    }
    private void women() {

        List<String> name =listOfFirstName();

        name = filter(name,n -> n.endsWith("a"));
        modifyAndDisplayNameList(name, n-> n+" - is female name.\n");



    }}