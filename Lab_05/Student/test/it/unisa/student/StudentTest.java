package it.unisa.student;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class StudentTest {
    @Test
    public void newStudentTest() {
        Student student = new Student("Dario", "Di Nucci");
        Assert.assertEquals("Dario", student.getFirstName());
        Assert.assertEquals("Di Nucci", student.getLastName());
        Assert.assertTrue(student.getExams().isEmpty());
    }

    @Test
    public void oneExamTest() {
        Student student = new Student("Dario", "Di Nucci");

        Exam exam = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(exam);

        Assert.assertEquals(1, student.getExams().size(), 0);
        Assert.assertEquals(30, student.computeAverageGrade(), 0);
    }

    @Test
    public void twoExamTest() {
        Student student = new Student("Dario", "Di Nucci");

        Exam exam1 = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(exam1);

        Exam exam2 = new Exam("Software Engineering", new GregorianCalendar(2024, Calendar.JANUARY, 20), 28);
        student.registerExam(exam2);

        Assert.assertEquals(2, student.getExams().size(), 0);
        Assert.assertEquals(29, student.computeAverageGrade(), 0);
    }

    @Test
    public void studentsOrderTest() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("a", "Joe"));
        students.add(new Student("a", "Mama"));
        students.add(new Student("a", "Ligma"));
        students.add(new Student("a", "Candice"));
        students.add(new Student("a", "Dragon"));

        Student first = students.get(0), last = students.get(0);
        for(Student s : students)
        {
            if(s.compareTo(first) < 0)
                first = s;
            if(s.compareTo(last) > 0)
                last = s;
        }

        Assert.assertTrue(first.compareTo(students.get(3)) == 0);
        Assert.assertTrue(last.compareTo(students.get(1)) == 0);
    }
}