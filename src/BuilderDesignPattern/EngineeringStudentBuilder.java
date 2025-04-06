package BuilderDesignPattern;

import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {


    public Student buildEngineeringStudent(EngineeringStudentBuilder engineeringStudentBuilder){
        return engineeringStudentBuilder.build();
    }
}
