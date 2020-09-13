package exercise.gpaAns;

import java.util.ArrayList;
import java.util.Calendar;

enum Gender {F, M}

public class Student {

    private final String name;
    private final Gender gender;
    private final ArrayList<CourseTaken> courseTakenList;
    private final int age;
    private final int year;

    Student(String name, Gender gender, int age, int year) {
        //todo add you code here
        this.name = name;
        this.gender = gender;
        this.courseTakenList = new ArrayList<>();
        this.age = age;
        this.year = year;
    }

    /**
     *  year will be set as current year when the user do not specify year
     */
    Student(String name, Gender gender, int age) {
        this(name, gender, age, Calendar.getInstance().get(Calendar.YEAR));
    }

    /**
     * add the course to courseTaken,
     * if already took that course, throw IllegalStateException("cannot take the same course again")
     */
    public void addCourse(int courseCode, int credit, Grade grade) {
        //todo add you code here
        for (CourseTaken c : courseTakenList) {
            if (c.isSameCourse(courseCode)) {
                throw new IllegalStateException("cannot take the same course again");
            }
        }
        courseTakenList.add(new CourseTaken(courseCode, credit, grade));
    }

    /**
     * remove course from courseTaken,
     * if no took that course before, throw IllegalStateException("never take that course before")
     */
    public void dropCourse(int courseCode) {
        //todo add you code here
        for (CourseTaken c : courseTakenList) {
            if (c.isSameCourse(courseCode)) {
                courseTakenList.remove(c);
                return;
            }
        }
        throw new IllegalStateException("never take that course before");
    }

    /**
     *  update the grade of the course if the new grade is better than the original grade,
     *  if never took that course, throw IllegalStateException("never take that course before")
     */
    public void retakeCourse(int courseCode, Grade newGrade) {
        for (CourseTaken c : courseTakenList) {
            if (c.isSameCourse(courseCode)) {
                c.changeGrade(newGrade);
                return;
            }
        }
        throw new IllegalStateException("never take that course before");
    }


    /**
     * getter to get CGA: sum up all(course credit * score point) / total credit taken
     */
    public double getCGA() {
        double norminator = 0;
        double denorminator = 0;
        for (CourseTaken c : courseTakenList) {
            norminator += c.getCredit() * c.getScorePt();
            denorminator += c.getCredit();
        }
        return norminator/denorminator;
    }

    /**
     *  student with cga < 2 will receive warning letter
     */
    public boolean needReceiveWarningLetter() {
        //todo add you code here
        return getCGA() < 2;
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
        System.out.println("Unofficial transcript");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Course Taken:");
        for (CourseTaken c : courseTakenList) {
            System.out.println("\t" + c.toString());
        }
        System.out.println("CGA in year " + year + " : " + getCGA());
    }

}
