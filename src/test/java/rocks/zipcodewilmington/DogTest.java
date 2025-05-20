package rocks.zipcodewilmington;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

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
    public void constructorTest(){
        String givenName = "Const";
        Date givenBirthDate = new Date();
        Dog dog = new Dog(givenName, givenBirthDate, null);

        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedDate);
        Assert.assertEquals(null, retrievedId);
    }

    @Test
    public void testIfDogSpeaks(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = null;
        Dog dog = new Dog(givenName, givenBirthDate, null);

        Assert.assertEquals("bark!", dog.speak());
    }

    @Test
    public void birthDateTest(){
        String givenName = "Const";
        Date givenBirthDate = new Date();
        Dog dog = new Dog(givenName, givenBirthDate, null);

        Date retrievedDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void testIfDogEatsFood1(){
        Date givenBirthDate = new Date();
        Dog dog = new Dog("", givenBirthDate, null);
        Food food = new Food();
        Integer initialMealsEaten = dog.getNumberOfMealsEaten();

        dog.eat(food);

        Assert.assertSame(initialMealsEaten + 1, dog.getNumberOfMealsEaten());
    }

    @Test
    public void testIfDogEatsFood2(){
        Date givenBirthDate = new Date();
        Dog dog = new Dog("", givenBirthDate, null);
        Food food = new Food();
        Integer initialMealsEaten = dog.getNumberOfMealsEaten();

        dog.eat(food);
        dog.eat(food);
        dog.eat(food);

        Assert.assertSame(initialMealsEaten + 3, dog.getNumberOfMealsEaten());
    }

    @Test
    public void idTest(){
        Date givenBirthDate = new Date();
        Dog dog = new Dog("", givenBirthDate, null);

        Integer retrievedId = dog.getId();

        Assert.assertEquals(dog.getId(), retrievedId);
    }

    @Test
    public void animalInheritanceTest1(){
        Date givenBirthDate = new Date();
        Dog dog = new Dog("", givenBirthDate, null);

        boolean isAnimal = dog instanceof Animal;

        Assert.assertTrue(isAnimal);
    }

    @Test
    public void mammalInheritanceTest(){
        Date givenBirthDate = new Date();
        Dog dog = new Dog("", givenBirthDate, null);

        boolean isMammal = dog instanceof Mammal;

        Assert.assertTrue(isMammal);
    }
}