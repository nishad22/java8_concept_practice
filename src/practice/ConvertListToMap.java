package practice;


import model.Notes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

    //How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
public class ConvertListToMap {

    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        Set<String> key = new HashSet<>();
//        Map<String,Integer> map11 = noteLst.stream()
//                .collect(Collectors.toMap(Notes::getNote, Notes::getNumberOfNotes, TreeMap::new));


        Map<String, Integer> noteMap = noteLst.stream()
                .collect(Collectors.toMap(
                        Notes::getNote,           // Key mapper
                        Notes::getNumberOfNotes,         // Value mapper
                        (existing, replacement) -> existing,  // Keep first occurrence
                        TreeMap::new                 // Sorted map
                ));

        System.out.println(noteMap);

//        Map<String, Long> notesRecords = noteLst.stream()
//                .sorted(Comparator.comparingInt(Notes::getNumberOfNotes).reversed()) // sorting is based on TagId 55,44,33,22,11
//                .collect(Collectors.toMap
//                        (Notes::getNote, Notes::getNumberOfNotes, (existing, replacement) -> (Integer) existing,LinkedHashMap::new));
//// consider old value 44 for dupilcate key
//// it keeps order
//        System.out.println("Notes : " + notesRecords);


    }
}
