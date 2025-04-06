package BuilderDesignPattern;

import java.util.Arrays;
import java.util.List;

/**
 * Builder Pattern is a creational design pattern which allows the construction of complex objects step-by-step.
 * In this example, we are using Builder Pattern.
 * Builder Pattern is used to separate the construction of an object from its representation.
 * It provides the flexibility of creating different types of objects using the same construction process.
 * Builder Pattern is often used when an object has many different properties that need to be set.
 * It is also used to simplify the construction of objects by breaking it down into steps.
 * Here, {@link BuilderDirector} is acting as a director and {@link StudentBuilder} is an interface which
 * provides the steps to construct an object.
 * {@link MBAStudentBuilder} and {@link EngineeringStudentBuilder} are concrete builder classes which
 * are implementing the {@link StudentBuilder} interface.
 * {@link Student} is the product class which is being constructed.

 * {@link BuilderMain} is the client class which is using the Builder Pattern to construct an object.
 */
public class BuilderMain {
    public static void main(String[] args) {

        checkBuilderDesignPattern();
    }

    public static void checkBuilderDesignPattern(){
//
        BuilderDirector builderDirector = new BuilderDirector(new MBAStudentBuilder());
        BuilderDirector builderDirector1 = new BuilderDirector(new EngineeringStudentBuilder());

        Student student = builderDirector.createStudent();
        System.out.println(student);
        Student student1 = builderDirector1.createStudent();
        System.out.println(student1);

        EngineeringStudentBuilder e = new EngineeringStudentBuilder();
        List<String> subjects = Arrays.asList("English", "Hindi", "Scientc");

        e.setRollNumber(7).setMotherName("lkdnfdl").setName("rahul").setSubjects(subjects).build();
        Student ess = e.buildEngineeringStudent(e);
        System.out.println(ess);
        Student s3 = Student.builder().setFatherName("ff").build();

    }
}
