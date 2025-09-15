package optional;

import model.Notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

// How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
public class OptionalPracticeExample {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        Optional.ofNullable(noteLst)// will return optional list
                .orElseGet(Collections::emptyList) //create an emptylist if noteLst null or empty
                .stream() //if not empty then convert to list
                .forEach(System.out::println); //print the list
    }
}
