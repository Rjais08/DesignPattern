import java.util.*;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }
}

public class ComparatorComparableClass {

    public static void main(String[] args) {

        // on map by converting to list
        Comparator<Map.Entry<String, Integer>> com = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() > o2.getValue()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Rahul", 32);
        studentMap.put("Ganesh", 44);
        studentMap.put("Ramesh", 23);
        studentMap.put("Suresh", 45);
        studentMap.put("Rajesh", 67);
        studentMap.put("Rakesh", 12);

//        for(Map.Entry entry : studentMap.entrySet()){
//            System.out.print(entry.getKey() + " : " + entry.getValue());
//        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(studentMap.entrySet());

        Collections.sort(entryList, com);

//        System.out.println();

//        for(Map.Entry entry : entryList){
//            System.out.print(entry.getKey() + " : " + entry.getValue());
//        }

        // Comparator on Simple List
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(98);
        nums.add(53);
        nums.add(12);
        nums.add(34);
        nums.add(99);

        Comparator<Integer> compList = ( o1, o2) -> o1%10>o2%10 ? 1 : -1;

        Collections.sort(nums, compList);
//        System.out.println(nums);

        // Comparator on custom class

        Comparator<Student> compstudent = (Student s1, Student s2) -> s1.age > s2.age ? 1 : -1;

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 32));
        students.add(new Student(2, "Ganesh", 44));
        students.add(new Student(3, "Ramesh", 23));
        students.add(new Student(4, "Suresh", 45));
        students.add(new Student(5, "Rajesh", 67));
        students.add(new Student(6, "Rakesh", 12));

        Collections.sort(students);

        System.out.println(students);
    }

}
