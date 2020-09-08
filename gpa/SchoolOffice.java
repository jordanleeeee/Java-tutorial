package exercise.gpa;

public class SchoolOffice {
    public static void main(String[] args) {
        Student peter = new Student("Peter", Gender.M, 20, 2019);
        peter.addCourse(1234, 3, Grade.A);
        try {
            peter.addCourse(1234, 3, Grade.A);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        peter.addCourse(2234, 2, Grade.B);
        peter.addCourse(3234, 4, Grade.A);
        peter.addCourse(4234, 1, Grade.C);
        peter.addCourse(5234, 1, Grade.F);
        peter.dropCourse(5234);
        try {
            peter.dropCourse(2222);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        peter.retakeCourse(4234, Grade.B);
        try {
            peter.retakeCourse(2222, Grade.A);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println("will peter receive warning letter? " + peter.needReceiveWarningLetter());

        peter.showTranscript();


        Student betty = new Student("Betty", Gender.F, 22);
        betty.addCourse(2233, 4, Grade.F);
        betty.addCourse(2234, 3, Grade.D);
        betty.addCourse(2235, 1, Grade.D);
        betty.addCourse(2236, 1, Grade.C);
        betty.addCourse(2237, 2, Grade.B);
        betty.retakeCourse(2233, Grade.C);
        betty.retakeCourse(2234, Grade.F);
        betty.dropCourse(2235);

        System.out.println("\n\nwill betty receive warning letter? " + betty.needReceiveWarningLetter());

        betty.showTranscript();
    }
}
