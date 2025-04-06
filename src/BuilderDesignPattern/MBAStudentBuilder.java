package BuilderDesignPattern;

import java.util.ArrayList;

public class MBAStudentBuilder extends StudentBuilder{

    ;
    public Student buildMbaStudent(EngineeringStudentBuilder engineeringStudentBuilder){
        return engineeringStudentBuilder.build();
    }
}
