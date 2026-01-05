import BuilderDesignPattern.*;
import BuilderDesignPattern.Student;
import SerializableDeserializable.Account;
import SerializableDeserializable.DeSerializableDemo;
import SerializableDeserializable.SerializableDemo;
import ThredsInJava.MonitorLockExample;
import ThredsInJava.ThreadTest2;
import ThredsInJava.ThreadTestPart1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

//        long n = 8;
//        checklist(((Long)n).intValue());

        int a=11, b=2,c;
        c=a/b;
        display(c);

    }


    public static void display(int a){
        System.out.println(a);
        if(a>0){
            display(a-1);
        }
        System.out.println(a);
    }



    public static void checklist(int num){
        System.out.println(num);
    }






}