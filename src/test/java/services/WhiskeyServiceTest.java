package services;

import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyServiceTest {
    @Test
    public void createTest(){

        // (1)
        String expectedName = "Fire Water";
        String expectedBrand = "FIRE";
        String expectedRegion = "Philadelphia";
        int expectedSize = 750;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        WhiskeyService WhiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        String actualRegion = testWhiskey.getRegion();
        int actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        double actualPrice = testWhiskey.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedRegion, actualRegion);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
        WhiskeyService.delete(actualId);
    }


    @Test
    void findWhiskey() {
        // (1)
        String expectedName = "Fire Water";
        String expectedBrand = "FIRE";
        String expectedRegion = "Philadelphia";
        int expectedSize = 750;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        WhiskeyService WhiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        String actualRegion = testWhiskey.getRegion();
        int actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        double actualPrice = testWhiskey.getPrice();
        Whiskey actual= WhiskeyService.findWhiskey(testWhiskey.getId());

        Assertions.assertEquals(testWhiskey,actual);
        WhiskeyService.delete(actualId);

    }

    @Test
    void findAll() {
        // (1)
        String expectedName = "Fire Water";
        String expectedBrand = "FIRE";
        String expectedRegion = "Philadelphia";
        int expectedSize = 750;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        WhiskeyService WhiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);
        Whiskey testWhiskey2 = WhiskeyService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);
        Whiskey testWhiskey3 = WhiskeyService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);


        // (3)
        Whiskey actual= WhiskeyService.findWhiskey(testWhiskey.getId());
        Whiskey[] actual1 = WhiskeyService.findAll();
        Whiskey[] expected = {testWhiskey, testWhiskey2, testWhiskey3};

        Assertions.assertArrayEquals(actual1, expected);


    }

    @Test
    void delete() {
        String expectedName = "Fire Water";
        String expectedBrand = "FIRE";
        String expectedRegion = "Philadelphia";
        int expectedSize = 750;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        WhiskeyService WhiskeyService = new WhiskeyService();

        Whiskey testWhiskey3 = WhiskeyService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);

        int actualId = testWhiskey3.getId();
        Whiskey actual= WhiskeyService.findWhiskey(testWhiskey3.getId());



        // (3)

        Assertions.assertTrue(WhiskeyService.delete(actualId));

    }

}