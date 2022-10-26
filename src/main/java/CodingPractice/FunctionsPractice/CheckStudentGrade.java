package CodingPractice.FunctionsPractice;

import java.util.Scanner;

/* Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will
display grades according to the marks entered */
public class CheckStudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        gradeCheck(marks);
    }

    public  static void gradeCheck(int marks){
        if(marks<=40){
            System.out.println("Fail");
        }
        if(marks>=41 && marks<=50){
            System.out.println("DD");
        }
        if(marks>=51 && marks<=60){
            System.out.println("CD");
        }
        if(marks>=61 && marks<=70){
            System.out.println("BC");
        }
        if(marks>=71 && marks<=80){
            System.out.println("BB");
        }
        if(marks>=81 && marks<=90){
            System.out.println("AB");
        }
        if(marks>=91 && marks<=100){
            System.out.println("AA");
        }
        if(marks>100){
            System.out.println("Enter correct marks");
        }



    }
}
