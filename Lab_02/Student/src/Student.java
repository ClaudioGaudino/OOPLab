import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private List<Exam> exams;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exams = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void registerExam(Exam exam) {
        exams.add(exam);
    }

    public double computeAverageGrade() {
        int acc = 0;
        for(Exam exam : exams)
        {
            acc += exam.getGrade();
        }
        return acc/exams.size();
    }
}