package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

    int rollNumber;
    String classs;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setClasss(String classs){
        this.classs= classs;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }

    public  StudentBuilder setSubjects(List<String> subjects){
        this.subjects = subjects;
        return this;
    }


    public Student build(){
        return new Student(this);
    }


}
