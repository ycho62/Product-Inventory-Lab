package services;

import models.Vodka;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.Provider;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VodkaServiceTest {
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
        VodkaService VodkaService = new VodkaService();
        Vodka testVodka = VodkaService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testVodka.getId();
        String actualName = testVodka.getName();
        String actualBrand = testVodka.getBrand();
        String actualRegion = testVodka.getRegion();
        int actualSize = testVodka.getSize();
        int actualQty = testVodka.getQty();
        double actualPrice = testVodka.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedRegion, actualRegion);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
        VodkaService.delete(actualId);
    }


    @Test
    void findVodka() {
        // (1)
        String expectedName = "Fire Water";
        String expectedBrand = "FIRE";
        String expectedRegion = "Philadelphia";
        int expectedSize = 750;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        VodkaService VodkaService = new VodkaService();
        Vodka testVodka = VodkaService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testVodka.getId();
        String actualName = testVodka.getName();
        String actualBrand = testVodka.getBrand();
        String actualRegion = testVodka.getRegion();
        int actualSize = testVodka.getSize();
        int actualQty = testVodka.getQty();
        double actualPrice = testVodka.getPrice();
        Vodka actual= VodkaService.findVodka(testVodka.getId());

        Assertions.assertEquals(testVodka,actual);
        VodkaService.delete(actualId);

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
        VodkaService VodkaService = new VodkaService();
        Vodka testVodka = VodkaService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);
        Vodka testVodka2 = VodkaService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);
        Vodka testVodka3 = VodkaService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);


        // (3)
        Vodka actual= VodkaService.findVodka(testVodka.getId());
        Vodka[] actual1 = VodkaService.findAll();
        Vodka[] expected = {testVodka, testVodka2, testVodka3};

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
        VodkaService VodkaService = new VodkaService();

        Vodka testVodka3 = VodkaService.create(expectedName, expectedBrand,
                expectedRegion, expectedSize, expectedQty, expectedPrice);

        int actualId = testVodka3.getId();
        Vodka actual= VodkaService.findVodka(testVodka3.getId());



        // (3)

        Assertions.assertTrue(VodkaService.delete(actualId));

    }
}