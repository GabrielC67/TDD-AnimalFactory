package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import org.junit.jupiter.api.*; // if using JUnit 5
import java.util.Date;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @BeforeEach
    void setup(){
        CatHouse.clear();
    }

    @Test
    public void testAddCat(){
        setup();
        Cat testCat = new Cat ("Joey", new Date(), 1);

        CatHouse.add(testCat);

        Assert.assertEquals(CatHouse.getCatById(1), testCat);
    }

    @Test
    public void testRemoveCatById(){
        setup();
        Cat testCat = new Cat("Jojo", new Date(), 2);

        CatHouse.add(testCat);
        CatHouse.remove(2);
        Cat retrieved = CatHouse.getCatById(2);

        Assert.assertNull(retrieved);
    }

    @Test
    public void testRemoveCatObject(){
        setup();
        Cat testCat = new Cat("Moogi", new Date(), 3);

        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        Cat retrievedCat = CatHouse.getCatById(3);

        Assert.assertNull(retrievedCat);
    }

    @Test
    public void testGetCatById(){
        setup();
        Cat testCat = new Cat("Momo", new Date(), 4);

        CatHouse.add(testCat);
        Cat retrievedCat = CatHouse.getCatById(4);

        Assert.assertEquals(testCat, retrievedCat);
    }

    @Test
    public void getNumberOfCatsTest1(){
        setup();
        Cat testCat1 = new Cat("Simba", new Date(), 5);
        Cat testCat2 = new Cat("Nala", new Date(), 6);
        Cat testCat3 = new Cat("Scar", new Date(), 7);
        Cat testCat4 = new Cat("Mufasa", new Date(), 8);

        CatHouse.add(testCat1);
        CatHouse.add(testCat2);
        CatHouse.add(testCat3);
        CatHouse.add(testCat4);

        int numberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(4, numberOfCats);
    }

    @Test
    public void getNumberOfCatsTest2() {//The difference is there's no reference variable
        setup();
        CatHouse.add(new Cat("Simba", new Date(), 5));
        CatHouse.add(new Cat("Nala", new Date(), 6));
        CatHouse.add(new Cat("Scar", new Date(), 7));
        CatHouse.add(new Cat("Mufasa", new Date(), 8));

        int numberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(4, numberOfCats);
    }
}
