package optional;



import optional.model.Bike;
import optional.model.Student;
import optional.model.StudentDatabase;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalFilterMapFlatMapExample {

    public static void main(String[] args) {
        System.out.println("filterString()");
        filterString().get().forEach(System.out::println);
        mapString();
        flatMapString();
    }

    //filter
    private static Optional<List<Student>> filterString() {
        Optional<List<Student>> optional = Optional.ofNullable(StudentDatabase.getAllStudents());
        if (optional.isPresent()) {
            return Optional.of(optional.get().stream()
                            .filter(Objects::nonNull)
                    .filter(student -> student.getGpa() >= 3.5)
                    .toList());
        }
       return Optional.empty();
    }
    //map
    private static void mapString(){
        Optional<Student> optional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if (optional.isPresent()){
            Optional<String> string = optional
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println("mapString(): "+string.get());
        }
    }
    //filterMap

    private static void flatMapString(){
        Optional<Student> optional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<String>  name = optional.filter(student -> student.getGpa()>3.0) //return -> Optional<Student <Optional<Bike>>
                .flatMap(Student::getBike) //return -> <Optional<Bike>
                .map(Bike::getName);

        name.ifPresent(str -> System.out.println("flatMapString() Bike name: "+str));
    }
}
