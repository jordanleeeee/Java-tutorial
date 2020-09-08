package exercise.gpa;

import java.util.ArrayList;

enum Gender {F, M}

public class Student {

    private String name;
    private Gender gender;
    private ArrayList<CourseTaken> courseTakenList;
    private int age;
    private int year;

    Student(String name, Gender gender, int age, int year) {
        //todo add you code here
    }

    /**
     *  year will be set as current year when the user do not specify year
     */
    Student(String name, Gender gender, int age) {
        //todo add your code here
    }

    /**
     * add the course to courseTaken,
     * if already took that course, throw IllegalStateException("cannot take the same course again")
     */
    public void addCourse(int courseCode, int credit, Grade grade) {
        //todo add you code here
    }

    /**
     * remove course from courseTaken,
     * if no took that course before, throw IllegalStateException("never take that course before")
     */
    public void dropCourse(int courseCode) {
        //todo add you code here
    }

    /**
     *  update the grade of the course if the new grade is better than the original grade,
     *  if never took that course, throw IllegalStateException("never take that course before")
     */
    public void retakeCourse(int courseCode, Grade newGrade) {
        //todo add your code here
    }


    /**
     * getter to get CGA: sum up all(course credit * score point) / total credit taken
     */
    public double getCGA() {
        //todo add your code here
        return 0;
    }

    /**
     *  student with cga < 2 will receive warning letter
     */
    public boolean needReceiveWarningLetter() {
        //todo add you code here
        return false;
    }

    /**
     * print the following information
     *
     *  Unofficial transcript
     *  Name: xxx
     *  Gender: xxx
     *  Age: xxx
     *  Course Taken:
     *      course code: xxx    credit: xxx     grade: xxx
     *      ...
     *      ...
     *   CGA in year xxx: xxx
     */
    public void showTranscript() {
        //todo add your code here
    }

}
