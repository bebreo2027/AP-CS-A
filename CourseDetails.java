/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coursedetails;


/**
 *
 * @author bebreo2027
 */
public class CourseDetails {
    
    public static void main(String[] args) {
        //Use the AP CS A's special made constructor that initializes all instance data
        Course myAPComputerScienceA = new Course("AP Computer Science A", "AP CS A", "5", "Dr. Nelson");
        //Use toString to print out the course description
        System.out.println(myAPComputerScienceA + "\n");
        //Use the name only constructor to make an object for AP Environmental Science, and manually use setters and getters
        Course myAPEnvironmentalScience = new Course();
        myAPEnvironmentalScience.setTitle("AP Environmental Science");
        myAPEnvironmentalScience.setCode("AP ES");
        myAPEnvironmentalScience.setPointsTotal("5");
        myAPEnvironmentalScience.setInstructorName("Mrs. DasGupta");
        System.out.println(myAPEnvironmentalScience + "\n");
        //Name-only constructor for making the college us history object, then setters, lastly toString for the description
        Course myCollegeUSHistory = new Course();
        myCollegeUSHistory.setTitle("College US History");
        myCollegeUSHistory.setCode("CUSH");
        myCollegeUSHistory.setPointsTotal("5");
        myCollegeUSHistory.setInstructorName("Mr. B");
        System.out.println(myCollegeUSHistory);
        
    }
}

//make the Course class with variables for the course title, code, points total, and instructor name
class Course {
    private String title;
    private String code;
    private String pointsTotal;
    private String instructorName; 

    //prepare a mutator for the title
    public void setTitle (String inTitle) {
            title = inTitle;
    }
    //prepare an accessor for the title
    public String getTitle () {
            return title;
    }
    //prepare a mutator for the code
    public void setCode (String inCode) {
            code = inCode;
    }
    //prepare an accessor for the code
    public String getCode () {
            return code;
    }
    //prepare a mutator for the point total
    public void setPointsTotal (String inPointsTotal) {
            pointsTotal = inPointsTotal;
    }
    //prepare an accessor for the point total
    public String getPointsTotal () {
            return pointsTotal;
    }
    //prepare a mutator for the instructor name
    public void setInstructorName (String inInstructorName) {
            instructorName = inInstructorName;
    }
    //prepare an accessor for the instructor name
    public String getInstructorName () {
            return instructorName;
    } 

    //prepare an accessor for the course description
    public void toString (String description) {
        System.out.println(description);
    } 
    //make a constructor that gets all the information for AP CS A
    public Course (String courseName, String courseCode, String coursePoints, String courseInstructor) {
        setTitle(courseName);
        setCode(courseCode);
        setPointsTotal(coursePoints);
        setInstructorName(courseInstructor);
    }
    //make a constructor for courses other than AP CS A
    public Course () {
        setTitle("");
        setCode("");
        setPointsTotal("");
        setInstructorName("");
    }
    
    public String toString(){
        String result = "";
        result = "Title of the course: " + title + "\n"
            + "Code of the course: " + code + "\n"
            + "Point total of the course: " + pointsTotal + "\n"
            + "Name of the course's instructor: " + instructorName;
        return result;
    }

}