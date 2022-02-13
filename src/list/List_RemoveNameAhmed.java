package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Ahmet", "John", "Bob", "Ahmet"));

        System.out.println(removeString(list, "Ahmet"));
    }

    public static ArrayList <String> removeString(ArrayList<String> list, String name){
        // Simple we're just using removeIf method
        list.removeIf(p-> p.equals(name));
        return list;
    }
}
/*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
 */