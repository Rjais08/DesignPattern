package BuilderDesignPattern;

public class BuilderDirector {

    StudentBuilder studentBuilder;

    public BuilderDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof MBAStudentBuilder){
            return this.studentBuilder.setClasss("MBA").setName("Rahul").setFatherName("Ashok").setMotherName("Manju").setRollNumber(1).build();
        }else{
            return this.studentBuilder.setClasss("Engineering").setName("Kheni").setFatherName("AshokBhai").setMotherName("Daya").setRollNumber(2).build();
        }
    }
}
