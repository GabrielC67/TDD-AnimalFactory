package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)

        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        String givenName = "Butter";
        Date givenBirthDate = new Date();
        Integer givenId = 10;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.setName(givenName);
        dog.setBirthDate(givenBirthDate);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest1() {
        String dogSpeak = "bark!";

        Dog dog = new Dog(null, null, null);

        String dogSpeakTest = dog.speak();

        Assert.assertEquals((dogSpeak), (dogSpeakTest));
    }

    @Test
    public void speakTest2() {
        String catNotDogSpeak = "meow";

        Dog dog = new Dog(null, null, null);

        String dogSpeakTest = dog.speak();

        Assert.assertNotEquals(catNotDogSpeak, dogSpeakTest);
    }

    @Test
    public void birthDateTest1() {
        Date givenBirthDate = new Date();

        Dog dog = new Dog(null, givenBirthDate, null);

        Date retrieveBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrieveBirthDate);
    }

    @Test
    public void birthDateTest2() {
        Date givenBirthDate = new Date();

        Dog dog = new Dog(null, givenBirthDate, null);

        String retrievedBirthDate = dog.getName();

        Assert.assertNotEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void idTest1() {
        Integer givenID = 15;

        Dog dog = new Dog(null, null, givenID);

        Integer retrievedID = dog.getId();

        Assert.assertEquals(givenID, retrievedID);
    }

    @Test
    public void idTest2(){

        Dog dog = new Dog(null, null, 007);

        Integer retrieveId = dog.getId();

        Assert.assertEquals(, retrieveId);
    }



}
