package streamapi;

import model.Student;
import model.StudentDatabase;

public class StreamMapReduceExample {

    public static void main(String[] args) {

        int noOfNoteBooks = StudentDatabase.getAllStudents().stream()
                .map(Student::getNoteBooks)//return Stream<Integer>
                .peek(countOfNotebook -> System.out.println("Count of note books: "+countOfNotebook))
                .reduce(0, Integer::sum); // same as reduce(0,(a,b) -> a + b);

        System.out.println("No. of noteBooks: "+noOfNoteBooks);

        int noOfNoteBooksAbove3 = StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(Student::getNoteBooks)//return Stream<Integer>
                .reduce(0, Integer::sum); // same as reduce(0,(a,b) -> a + b);

        System.out.println("No. of noteBooks above grade 3: "+noOfNoteBooksAbove3);
    }
}
