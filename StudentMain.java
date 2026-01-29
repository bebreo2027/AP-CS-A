/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmain;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bebreo2027
 */
//public class
public class StudentMain{
    public static void main(String args[]){
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        students.add(new Student("Bob", "Smith", 85, 90, 95));
        students.add(new Student("Yap", "Yoyopipi", 87, 93, 90));
        students.add(new Student("Sus", "SkBiddi", 90, 95, 100));
        boolean willLoop = true;
        while (willLoop) {            
          System.out.println(students + "\nWant to add more students? Type y");
          if (s.nextLine().equalsIgnoreCase("y")) {
              System.out.println("Type the first name of the student in one line, the last name in the next line\n"
                      + "and then the grades of the student in the three lines afterwards");
              String inName = s.nextLine();
              String inLastName = s.nextLine();
              String firstGrade = s.nextLine();
              String secondGrade = s.nextLine();
              String thirdGrade = s.nextLine();
              students.add(new Student(inName, inLastName, Integer.parseInt(firstGrade), Integer.parseInt(secondGrade), Integer.parseInt(thirdGrade)));
          } else {
            willLoop = false;
          }
        }
        
        
    }
}
//basic class Student - should have 3 courses
class Student {
    private String firstName, lastName;
    private Course c1 = new Course();
    int a;
    private Course c2 = new Course();
    int b;
    private Course c3 = new Course();
    int c;
    //empty constructor to create empty Student object
    public Student() {
        firstName = "";
        lastName = "";
    }
    //basic constructor to create Student object with name only
    public Student(String first, String last){
        firstName = first;
        lastName = last;
    }
    //constructor to create Student object with name and scores
    public Student(String first, String last, int scr1, int scr2, int scr3){
        firstName = first;
        lastName = last;
        a = c1.setScore(scr1);
        b = c2.setScore(scr2);
        c = c3.setScore(scr3);
    }
    private int getAverage(){
        return (a + b + c)/3;
    }
    
    private String getName(){
        return firstName +" "+ lastName;
    }
    
    //needs a constructor to include 3 course objects
    //basic toString code
    public String toString() {
        String result;
        result = getName()
               + "'s average test score: " + getAverage();
        return result;
    }
}
//basic class Course
class Course {
    private int score;
    //Constructor makes score 0 if no parameters inputted
    public Course(){
        score = 0;
    }
    //overloaded constructor that sets the score according to the parameter
    public Course (int inScore){
        setScore(inScore);
    }

    public int setScore(int inScore){
        score = inScore;
        return score;
    }
    public int getScore(){
        return score;
    }
}
