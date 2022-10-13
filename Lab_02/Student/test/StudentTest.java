import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentTest {
    
    @Test
    public void fullTest()
    {
        GregorianCalendar date = new GregorianCalendar();
        Student student = new Student("Claudio", "Gaudino");
        Exam firstExam = new Exam("", date, 100);
        Exam secondExam = new Exam("", date, 50);
        Exam thirdExam = new Exam("", date, 75);
        Exam[] exams = {firstExam, secondExam, thirdExam};
        for(Exam exam : exams)
        {
            student.registerExam(exam);
        }
        Assert.assertEquals(75, student.computeAverageGrade(), 0);
    }
}