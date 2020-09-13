package exercise.gpaAns;

enum Grade{A, B, C, D, F}

/**
 * A: 4
 * B: 3
 * C: 2
 * D: 1
 * F: 0
 */

public class CourseTaken {

    private final int courseCode;
    private final int credit;
    private Grade grade;

    public CourseTaken(int courseCode, int credit, Grade grade){
        //todo add you code here
        this.courseCode = courseCode;
        this.credit = credit;
        this.grade = grade;
    }

    public void changeGrade(Grade grade) {
        //todo add you code here
        if(getScorePt(grade) > getScorePt(this.grade)){
            this.grade = grade;
        }
    }

    private int getScorePt(Grade grade) {
        //todo add you code here
        switch (grade) {
            case A: return 4;
            case B: return 3;
            case C: return 2;
            case D: return 1;
            case F: return 0;
            default: throw new IllegalStateException();
        }
    }

    public int getScorePt() {
        return getScorePt(grade);
    }

    public int getCredit(){
        return credit;
    }

    public boolean isSameCourse(int courseCode) {
        return this.courseCode == courseCode;
    }

    @Override
    public String toString() {
        return "course code: " + courseCode + "\tcredit: " + credit + "\tgrade: " + grade;
    }

}
