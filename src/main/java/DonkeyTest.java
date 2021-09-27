/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DonkeyTest {
    Donkey d1;
    Donkey d2;

    @Before
    public void setUp() throws Exception {
        d1 = new Donkey();
        d2 = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Neighhh", d1.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, d1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d1.upgradeSpeed();
        assertEquals(11, d1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d1.downgradeSpeed();
        assertEquals(10, d1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, d1.getPrice());
    }
    @Test(timeout=50)
    public void TestReproduce1() {
        d1.reproduce(d2);
        assertEquals(2, d2.getNumberOfChildren());
        assertEquals(2, d2.getNumberOfChildren());
    }
    public void TestReproduce2() {
        d2.setReproductive(false);
        d1.reproduce(d2);
        assertEquals(1, d2.getNumberOfChildren());
        assertEquals(1, d2.getNumberOfChildren());

    }

}
