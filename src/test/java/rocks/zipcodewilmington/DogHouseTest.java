package rocks.zipcodewilmington;



import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @BeforeEach
    void setup() {
        DogHouse.clear();
    }

    @Test
    public void testAddDog(){
        setup();
        Dog testDog = new Dog("Juju", new Date(), 1);

        DogHouse.add(testDog);

        Dog retrievedDogForTest = DogHouse.getDogById(1);

        Assert.assertEquals(testDog, retrievedDogForTest);
    }

    @Test
    public void removeDogTest(){
        DogHouse.remove(1);

        Dog retrieveDogById = DogHouse.getDogById(1);

        Assert.assertNull(retrieveDogById);
    }

    @Test
    public void removeDogByIdTest(){
        setup();
        Dog testDog = new Dog("Lester", new Date(), 2);

        DogHouse.add(testDog);
        DogHouse.remove(testDog);

        Dog dogRetieved = DogHouse.getDogById(2);

        Assert.assertNull(dogRetieved);

        Dog retrivedDogForTest = DogHouse.getDogById(1);
    }

    @Test
    public void testGetDogById(){
        setup();
        Dog testDog = new Dog("Chilli", new Date(), 3);

        DogHouse.add(testDog);

        Dog retrieved = DogHouse.getDogById(3);

        Assert.assertEquals(testDog, retrieved);
    }

    @Test
    public void testGetNumberOfDogs(){
        setup();
        DogHouse.add(new Dog("LeftEye", new Date(), 4));
        DogHouse.add(new Dog("TBoz", new Date(), 5));
        DogHouse.add(new Dog("Chili", new Date(), 6));

        int numberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(3, numberOfDogs);
    }
}
