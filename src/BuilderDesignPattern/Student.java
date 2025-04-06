package BuilderDesignPattern;

import java.util.List;

public class Student {

    private int rollNumber;
    private String classs;
    private String name;
    private String fatherName;
    private String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.rollNumber;
        this.classs = studentBuilder.classs;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    public static StudentBuilder builder() {
        return null;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", classs='" + classs + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }


}
