package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest1() {
        //Given
        String givenName = "Little Reds";
        Date givenBirthDate = new Date();
        Integer givenID = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        //When
        String retrievedName = cat.getName();


        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void setNameTest2() {
        //Given
        String givenName = "Edmond";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        //When
        String retrievedName = cat.getName();


        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void setNameTest3() {
        //Given
        String givenName = "Peanut";
        Date givenBirthDate = new Date();
        Integer givenID = 2;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        //When
        String retrievedName = cat.getName();


        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void speakTest1() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenID = 2;
        String catSpeak = "meow!";


        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        String catSpeakTest1 = cat.speak();

        Assert.assertEquals(catSpeak, catSpeakTest1);
    }


    @Test
    public void speakTest2() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenID = 3;

        Dog dog = new Dog(null, null, null);
        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        String dogSpeak = dog.speak();
        String catSpeakTest2 = cat.speak();

        Assert.assertNotEquals(dogSpeak, catSpeakTest2);
    }

    @Test
    public void setBirthDateTest1(){
        String givenName = "";
        Date givenBirthDate = new Date(1635702400000L);
        Integer givenID = 4;

        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        Date retrievedBirthdate1 = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthdate1);
    }

    @Test
    public void setBirthDateTest2(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenID = 5;

        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        Date retrievedBirthdate2 = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthdate2);
    }

    @Test
    public void getID1(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenID = 5;

        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        Integer getID = cat.getId();

        Assert.assertEquals(givenID, getID);
    }

    @Test
    public void getID2(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenID = 9;

        Cat cat = new Cat(givenName, givenBirthDate, 8);

        Integer getID = cat.getId();

        //Tested 8 as a parameter and used 8 as the initialized variable.
        Assert.assertNotEquals(givenID, getID);
    }

    @Test
    public void getID3(){
        String givenName = "Bartholomew";
        Date givenBirthDate = new Date();
        Integer givenID = 9;

        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        Integer getID = cat.getId();

        Assert.assertEquals(givenID, getID);
    }

//    @Test
//    public void eatFoodTest1(){
//        String givenName = "";
//        Date givenBirthDate = new Date();
//        Integer givenID = 6;
//
//        Cat cat = new Cat(givenName, givenBirthDate, givenID);
//
//
//    }
}

