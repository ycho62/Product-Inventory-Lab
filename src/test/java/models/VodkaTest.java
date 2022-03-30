package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VodkaTest {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Fun juice";

        // when (2)
        Vodka testVodka = new Vodka();
        testVodka.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getName());
    }

    @Test
    public void setIdTest() {
        //given
        int expected = 12;

        //when
        Vodka testVodka = new Vodka();
        testVodka.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getId());
    }

    @Test
    public void setBrandTest() {
        //given
        String expected = "Titos";

        //when
        Vodka testVodka = new Vodka();
        testVodka.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getBrand());
    }

    @Test
    public void setRegionTest() {
        //given
        String expected = "American";

        //when
        Vodka testVodka = new Vodka();
        testVodka.setRegion(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getRegion());
    }

    @Test
    public void setSizeTest() {
        //given
        int expected = 750;

        //when
        Vodka testVodka = new Vodka();
        testVodka.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getSize());
    }

    @Test
    public void setQty() {
        //given
        int expected = 100;

        //when
        Vodka testVodka = new Vodka();
        testVodka.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getQty());
    }

    @Test
    public void setPrice() {
        //given
        Double expected = 25.00;

        //when
        Vodka testVodka = new Vodka();
        testVodka.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testVodka.getPrice());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Fire water";
        String expectedBrand = "FIRE";
        String expectedRegion = "Philadelphia";
        int expectedSize = 750;
        int expectedQty = 10;
        double expectedPrice = 25.99;

        // (3)
        Vodka testSneaker = new Vodka(expectedId, expectedName, expectedBrand,
                expectedRegion,expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedRegion, testSneaker.getRegion());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }
}


