import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    @Test
    public void InstructorInstanceofTeacher() {

        Instructor instructor = new Instructor(70760L, "Omizz");

        boolean actual = instructor instanceof Teachable;

        Assertions.assertTrue(actual);
    }

    @Test
    public void InstructorInstanceofPerson() {

        Instructor instructor = new Instructor(70760L, "Omizz");

        boolean actual = instructor instanceof Person;

        Assertions.assertTrue(actual);


    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(43576L, "Omizz");
        Student student = new Student(6969L, "Dullz");
        double expected = 23.0;
        instructor.teach(student, 23.0);

        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(53434L, "Omizz");
        Student student = new Student(55656L, "Dullz");
        Student student2 = new Student(67584L, "Aqil");


        Student[] students = {student, student2};
        instructor.lecture(students, 12);
        Double expected = 6.0;
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }

}