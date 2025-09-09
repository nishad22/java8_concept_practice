package functionalInterface;

import model.Student;
import model.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    private static final List<Student> studentList = StudentDatabase.getAllStudents();

    private static void nameAndActivities(){
        BiConsumer<String,List<String>> biConsumer = (name,listOfActivities) -> System.out.println(name +" : "+listOfActivities);
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (str1, str2) -> System.out.println(str1 +" "+str2);
        biConsumer.accept("Nishad","Deora");
        nameAndActivities();
    }
}
