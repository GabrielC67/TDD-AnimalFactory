package rocks.zipcodewilmington;

import org.junit.*;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Optional;

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
    public void setNameTest1(){
        String givenName = "Kit";
        Date givenBirthDate = new Date();
        Integer givenId = null;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String retrievedName = cat.getName();

        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void setNameTest2(){
        String givenName = "Ice";
        Date givenBirthDate = new Date();
        Integer givenId = null;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String retrievedName = cat.getName();

        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void setBirthdateTest1(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = null;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Date retrievedDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void setBirthdateTest2(){
        String givenName = "";
        Date givenBirthDate = new Date(01/ 1 /2001);
        Integer givenId = null;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Date retrievedDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void speakTest1(){
        String expectedSpeak = "meow!";
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = null;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String catSpeaks = cat.speak();

        Assert.assertEquals(expectedSpeak, catSpeaks);
    }

    @Test
    public void speakTest2(){
        String catCanAlsoSay = "HISS!!";
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = null;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String catSpeaks = cat.speak();

        Assert.assertNotEquals(catCanAlsoSay, catSpeaks);
    }

    @Test
    public void catEatsTest1(){
        Date givenBirthDate = new Date();
        Cat cat = new Cat("", givenBirthDate, null);
        Food food = new Food();
        Integer initialMealsEaten = cat.getNumberOfMealsEaten();

        cat.eat(food);

        Assert.assertSame(initialMealsEaten + 1, cat.getNumberOfMealsEaten());
    }

    @Test
    public void catEatsTest2(){
        Date givenBirthDate = new Date();
        Cat cat = new Cat("", givenBirthDate, null);
        Food food = new Food();
        Integer initialMealsEaten = cat.getNumberOfMealsEaten();

        cat.eat(food);
        cat.eat(food);
        cat.eat(food);

        Assert.assertSame(initialMealsEaten + 3, cat.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest1(){
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Cat cat = new Cat("", givenBirthDate, givenId);

        Assert.assertSame(1, cat.getId());
    }

    @Test
    public void getIdTest2() {
        Date givenBirthDate = new Date();
        Integer givenId = 4;
        Cat cat = new Cat("", givenBirthDate, givenId);

        Integer expectedId = 4;

        Assert.assertSame(expectedId, cat.getId());
    }

    @Test
    public void animalInheritanceTest(){
        Date setBirthDate = new Date();
        Cat cat = new Cat("", setBirthDate, null);

        boolean isAnimal = cat instanceof Animal;

        Assert.assertTrue(isAnimal);

    }

    @Test
    public void mammalInheritanceTest(){
        Date setBirthDate = new Date();
        Cat cat = new Cat("", setBirthDate, null);

        boolean isMammal = cat instanceof Mammal;

        Assert.assertTrue(isMammal);
    }
}

