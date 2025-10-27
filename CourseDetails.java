

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
        Course myAPComputerScienceA = new Course("AP Computer Science A");
        myAPComputerScienceA.toString("""
                                      AP Computer Science A is equivalent to a first-semester,
                                      college-level course in computer science. The course
                                      introduces students to computer science with fundamental
                                       topics that include problem solving, design strategies
                                       and methodologies, organization of data,
                                      approaches to processing data, analysis of potential
                                       solutions, and the ethical and social implications of
                                      computing. The course emphasizes both object-oriented
                                      and imperative problem solving and design using Java
                                      language. These techniques represent proven approaches
                                       for developing solutions that can scale up from small,
                                       simple problems to large, complex problems. 
                                      """);
        Course myAPEnvironmentalScience = new Course(1);
        myAPEnvironmentalScience.setTitle("AP Environmental Science");
        myAPEnvironmentalScience.setCode("AP ES");
        myAPEnvironmentalScience.setPointsTotal("5");
        myAPEnvironmentalScience.setInstructorName("Mrs. DasGupta");
        myAPEnvironmentalScience.courseInfo();
        System.out.println(myAPEnvironmentalScience.courseInfo());
        myAPEnvironmentalScience.toString("""
                                          AP Environmental Science is an introductory 
                                          college-level course. Students will identify and 
                                          analyze environmental problems, both natural and 
                                          man-made, and evaluate the relative risks 
                                          associated with these problems.  This course has 
                                          been aligned to College Board Guidelines for 
                                          Advanced Placement Environmental Science. Topics 
                                          of study include the essentials of ecology and 
                                          biodiversity, population issues, climate disruption, 
                                          soil and water pollution, along with economics 
                                          and politics of sustainability. 
                                          """);
        Course myCollegeUSHistory = new Course(2);
        myCollegeUSHistory.setTitle("College US History");
        myCollegeUSHistory.setCode("CUSH");
        myCollegeUSHistory.setPointsTotal("5");
        myCollegeUSHistory.setInstructorName("Mr. B");
        myCollegeUSHistory.courseInfo();
        System.out.println(myCollegeUSHistory.courseInfo());
        myCollegeUSHistory.toString("""
                                     It emphasizes political, economic, social, and cultural 
                                    developments and goes into great depths of historical 
                                    analysis. Examinations of primary source documents, 
                                    class discussions, essays, and exams are used to enhance 
                                    student understanding of American history. It is a 
                                    lively class with a traditional lecture format and 
                                    socratic method as the main format for student/professor 
                                    interaction. 
                                    """);
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
    public Course (String courseName) {
    setTitle(courseName);
    setCode("AP CS A");
    setPointsTotal("5");
    setInstructorName("Dr. Nelson");
        System.out.println(courseInfo());
    }
    //make a constructor for courses other than AP CS A
    public Course (int otherInt) {
    }
    //method that prints course info
    public String courseInfo(){
            return ("Title of the course: " + title + "\n"
            + "Code of the course: " + code + "\n"
            + "Point total of the course: " + pointsTotal + "\n"
            + "Name of the course's instructor: " + instructorName);
    }
}
