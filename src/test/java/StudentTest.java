import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    public void StudentLearnerTest() {
        Student student = new Student(6565L, "Omizz");

        boolean actual = student instanceof Learner;

        Assertions.assertTrue(actual);


    }

    @Test
    public void StudentPersonTest() {


        Student student = new Student(5678L, "Aqil");

        boolean actual = student instanceof Person;

        Assertions.assertTrue(actual);

    }

    @Test
    public void testLearn() {
        Student student = new Student(6789L, "Mike JOnes");
        Double expected = 8.0;
        student.learn(8);
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }


}