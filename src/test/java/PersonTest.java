import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void TestConstructor(){
        Person person = new Person(654L, "Dullz") {
            @Override
            public double getTotalStudyTime() {
                return 0;
            }
        };

        long expectedId = 654;
        String expectedName = "Dullz";

        Assertions.assertEquals(expectedId, person.getId());
        Assertions.assertEquals(expectedName, person.getName());

    }

    @Test
    public void testSetName() {

        Person person = new Person(696L, "Omizz") {
            @Override
            public double getTotalStudyTime() {
                return 0;
            }
        };

        String expected = "Omizz";

        person.setName(expected);
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }

}