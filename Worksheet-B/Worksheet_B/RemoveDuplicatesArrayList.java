package Worksheet_B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        // Dummy ArrayList
        ArrayList<Integer> listWithDuplicates = new ArrayList<>( 
            List.of(1, 2, 3, 1, 4, 2, 5));
        
        System.out.println("ArrayList with duplicates: " + listWithDuplicates);
        
        HashSet<Integer> set = new HashSet<>();
        
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>();
        
        for (Integer element : listWithDuplicates) {
            if (!set.contains(element)) {
                set.add(element);
                listWithoutDuplicates.add(element);
            }
        }
        
        System.out.println("ArrayList without duplicates: " + listWithoutDuplicates);
    }
}

