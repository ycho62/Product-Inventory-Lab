package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Crazy juice";

        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getName());
    }

    @Test
    public void setIdTest() {
        //given
        int expected = 12;

        //when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setBrandTest() {
        //given
        String expected = "Jack Daniels";

        //when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    public void setRegionTest() {
        //given
        String expected = "Tennessee";

        //when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setRegion(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getRegion());
    }

    @Test
    public void setSizeTest() {
        //given
        int expected = 750;

        //when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getSize());
    }

    @Test
    public void setQty() {
        //given
        int expected = 100;

        //when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }

    @Test
    public void setPrice() {
        //given
        Double expected = 25.00;

        //when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
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
        Whiskey testSneaker = new Whiskey(expectedId, expectedName, expectedBrand,
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