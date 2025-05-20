package rocks.zipcodewilmington;

import rocks.zipcodewilmington.animals.Animal;
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
        Dog dog = new Dog("", givenBirthDate, null);

        Dog newDog = factory.createDog("Codi", givenBirthDate);

        Assert.assertEquals(dog.getName(), newDog.getName());
        Assert.assertEquals(dog.getBirthDate(), newDog.getBirthDate());
        Assert.assertEquals(dog.getId(), newDog.getId());
    }
}
