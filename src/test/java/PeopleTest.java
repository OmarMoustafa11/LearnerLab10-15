import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {


    People people;

    @BeforeEach
    public void setUpBeforeEach() {
        people  = new People();
    }

    @Test
    public void addTest() {
        int expected =1;

        people.add(new Person(3232L, "Omizz") {
            @Override
            public double getTotalStudyTime() {
                return getTotalStudyTime();
            }
        });

        Assertions.assertEquals(expected, people.ArraylistSize());

    }

    @Test
    public void RemoveNameTest() {
        int expected = 0;

        Person person = new Person(3232L, "Omizz") {
            @Override
            public double getTotalStudyTime() {
                return 0;
            }
        };

        people.add(person);

        people.RemovePersonObjecttoPersontoPersonList(person);

        Assertions.assertEquals(expected, people.ArraylistSize());


    }

    @Test
    public void testFindId(){

        People people = new People();

        List<Person> personList = new ArrayList<>();

        personList.add( new Person(3232L, "Omizz") {
                           @Override
                           public double getTotalStudyTime() {
                               return getTotalStudyTime();
                           }
                       });

        people.setPersonList(personList);

        Person expected = personList.get(0);

        Person actual = people.findPersonById(3232L);

        Assertions.assertEquals(expected, actual);

    }

}