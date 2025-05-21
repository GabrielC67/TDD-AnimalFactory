package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        Date givenBirthDate = new Date();
        AnimalFactory factory = new AnimalFactory();
        Dog expectedDog = new Dog("Codi", givenBirthDate, 0);

        Dog newDog = factory.createDog("Codi", givenBirthDate);

        Assert.assertEquals(expectedDog.getName(), newDog.getName());
        Assert.assertEquals(expectedDog.getBirthDate(), newDog.getBirthDate());
        Assert.assertEquals(expectedDog.getId(), newDog.getId());
    }
    @Test
    public void createCatTest(){
        Date givenBirthDate = new Date();
        AnimalFactory factory = new AnimalFactory();
        Cat expectedCat = new Cat("Peanut", givenBirthDate, 0);

        Cat newCat = factory.createCat("Peanut", givenBirthDate);

        Assert.assertEquals(expectedCat.getName(), newCat.getName());
        Assert.assertEquals(expectedCat.getBirthDate(), newCat.getBirthDate());
        Assert.assertEquals(expectedCat.getId(), newCat.getId());
    }

}
