package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiUseCase {

    public static void main(String[] args) {
        // 1. Find the Duplicate Elements in given list of Integers using Stream API
        // Input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11]
        // Output [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Method 1.
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = inputList.stream().distinct().collect(Collectors.toList());
//        System.out.println(output);

        // Method 2.
        Set<Integer> result = inputList.stream().collect(Collectors.toSet());
//        System.out.println(result);

        // Method 3.
        Set<Integer> set = new HashSet<>();
//        inputList.stream().filter(a -> set.add(a)).peek(System.out::println).collect(Collectors.toList());

        // Method 4.

        // 2. count characters in String
        // Input -> "hello"
        // Output -> h=1, e=1, l=2, o=1;

        // Collectors.groupingBy only work with obj not with any other data type.

        String input = "hello";
//        Map<Character, Long> resul = input.chars().mapToObj(c -> (char) c).peek(System.out::println).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(resul);

        //2. Count Number of occurrence of words in String using java 8;

        // Input -> welcome to code decode and code decode welcome you;
        //Output -> {code = 2, and=1, to=1, decode=2, welcome = 2, you = 1}

        // method 1.
        List<String> stringList = Arrays.asList("welcome to code decode and code decode welcome you");

        Map<String, Long> resultMap = stringList.stream().map(str -> str.split(" ")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(resultMap);

        // method 2.
        List<String>stringList1 = Arrays.asList("welcome to code decode and code decode welcome you".split(" "));
        Map<String, Long> resultMap1 = stringList1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resultMap1);

        // 3. list of non repeating integers from list of integers using java 8;

        // Input -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8]
        // Output -> [9,10];

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8);
//        System.out.println(list.stream().distinct().peek(System.out::println).filter(a -> Collections.frequency(list, a) == 1).collect(Collectors.toList()));

        // Now i want first non repeating let say in above list it is 9;

//        System.out.println(list.stream().distinct().filter(a -> Collections.frequency(list, a) == 1).findFirst().get());

        // find duplicate Element using java 8

        //input -> [10,28,87,10,20,76,28,80,80]
        //output -> [10,28,80]

        List<Integer> duplicateList = Arrays.asList(10,28,87,10,20,76,28,80,80);
        Set<Integer> uniqueElement = new HashSet<>();

       Set<Integer> resultSet =  duplicateList.stream().filter(a-> !uniqueElement.add(a)).collect(Collectors.toSet());
//        System.out.println(resultSet);

        // Write a Program to multiply 2 no's using functional Interface.

        FunctionalInterfaceEx f = ( a, b) ->  a*b;

        System.out.println(f.multiply(7,8));

        // write logic to check if any number is prime or not





    }

}
