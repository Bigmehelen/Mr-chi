package TestPackage;

import AutomaticBike.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAutomaticBike {
    AutomaticBike myAutomaticBike;

    @BeforeEach
    public void setUp() {
        myAutomaticBike = new AutomaticBike();
    }

    @Test
    public void automaticBikeCanOnTest() {
        assertFalse(myAutomaticBike.isStatus());
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
    }

    @Test
    public void automaticBikeCanOffTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        myAutomaticBike.isOff();
        assertFalse(myAutomaticBike.isStatus());
    }

    @Test
    public void automaticBikeCanAccelerateBy1WhenBikeIsOnGearOneTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());
        assertEquals(0, myAutomaticBike.getSpeed());

        myAutomaticBike.accelerate();

        assertEquals(1, myAutomaticBike.getSpeed());
    }

    @Test
    public void automaticBikeCanAccelerateBy2WhenBikeIsOnGearTwoTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());
        assertEquals(0, myAutomaticBike.getSpeed());
        myAutomaticBike.increaseGear();
        assertEquals(2, myAutomaticBike.getGear());

        myAutomaticBike.accelerate();
        assertEquals(2, myAutomaticBike.getSpeed());
    }

    @Test
    public void automaticBikeCanAccelerateBy3WhenBikeIsOnGearThreeTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());
        assertEquals(0, myAutomaticBike.getSpeed());
        myAutomaticBike.increaseGear();
        assertEquals(2, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(3, myAutomaticBike.getGear());

        assertEquals(0, myAutomaticBike.getSpeed());
        myAutomaticBike.accelerate();
        assertEquals(3, myAutomaticBike.getSpeed());
    }

    @Test
    public void automaticBikeCanAccelerateBy4WhenBikeIsOnGearFourTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());
        assertEquals(0, myAutomaticBike.getSpeed());
        myAutomaticBike.increaseGear();
        assertEquals(2, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(3, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(4, myAutomaticBike.getGear());

        assertEquals(0, myAutomaticBike.getSpeed());
        myAutomaticBike.accelerate();
        assertEquals(4, myAutomaticBike.getSpeed());
    }

    @Test
    public void setMyAutomaticBikeCanDecreaseBy1WhenBikeIsOnGearOneTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());

        for (int count = 1; count <= 10; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(10, myAutomaticBike.getSpeed());

        myAutomaticBike.decelerate();
        assertEquals(9, myAutomaticBike.getSpeed());
    }

    @Test
    public void setMyAutomaticBikeCanDecreaseBy2WhenBikeIsOnGearTwoTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(2, myAutomaticBike.getGear());
        for (int count = 1; count <= 10; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(20, myAutomaticBike.getSpeed());

        myAutomaticBike.decelerate();
        assertEquals(18, myAutomaticBike.getSpeed());

    }

    @Test
    public void setMyAutomaticBikeCanDecreaseBy3WhenBikeIsOnGearThreeTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(2, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(3, myAutomaticBike.getGear());
        for (int count = 1; count <= 10; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(30, myAutomaticBike.getSpeed());

        myAutomaticBike.decelerate();
        assertEquals(27, myAutomaticBike.getSpeed());
    }

    @Test
    public void setMyAutomaticBikeCanDecreaseBy4WhenBikeIsOnGearFourTest() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(2, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(3, myAutomaticBike.getGear());

        myAutomaticBike.increaseGear();
        assertEquals(4, myAutomaticBike.getGear());

        for (int count = 1; count <= 10; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(40, myAutomaticBike.getSpeed());

        myAutomaticBike.decelerate();
        assertEquals(36, myAutomaticBike.getSpeed());
    }

    @Test
    public void automaticBikeCanChangeGearToGearTwoAtSpeedFrom21To30Test() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        assertEquals(1, myAutomaticBike.getGear());
        for (int count = 1; count <= 21; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(21, myAutomaticBike.getSpeed());
        assertEquals(2, myAutomaticBike.getGear());
    }

    @Test
    public void automaticBikeCanChangeGearToGearThreeAtSpeedFrom31To40Test() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());

        for (int count = 1; count <= 21; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(2, myAutomaticBike.getGear());
        assertEquals(21, myAutomaticBike.getSpeed());

        for (int count = 1; count <= 5; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(31, myAutomaticBike.getSpeed());
        assertEquals(3, myAutomaticBike.getGear());
    }

    @Test
    public void automaticBikeCanChangeGearToGearFourAtSpeedFrom41Test() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        for (int count = 1; count <= 21; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(2, myAutomaticBike.getGear());
        assertEquals(21, myAutomaticBike.getSpeed());
        for (int count = 1; count <= 5; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(31, myAutomaticBike.getSpeed());
        assertEquals(3, myAutomaticBike.getGear());

        for (int count = 1; count <= 4; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(43, myAutomaticBike.getSpeed());
        assertEquals(4, myAutomaticBike.getGear());
    }

    @Test
    public void automaticBikeCanDecreaseGearFromGearFourToGear3Test() {
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        for (int count = 1; count <= 41; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(87, myAutomaticBike.getSpeed());
        assertEquals(4, myAutomaticBike.getGear());

        for (int count = 1; count <= 12; count++) {
            myAutomaticBike.decelerate();
        }
        assertEquals(39, myAutomaticBike.getSpeed());
        assertEquals(3, myAutomaticBike.getGear());
    }

    @Test
    public void automaticBikeDecreaseGearFromThreeToTwo(){
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        for (int count = 1; count <= 26; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(31, myAutomaticBike.getSpeed());
        assertEquals(3, myAutomaticBike.getGear());

        for (int count = 1; count <= 4; count++) {
            myAutomaticBike.decelerate();
        }
        assertEquals(21, myAutomaticBike.getSpeed());
        assertEquals(2, myAutomaticBike.getGear());
    }

    @Test
    public void automaticBikeDecreaseGearFromTwoToOne(){
        myAutomaticBike.isOn();
        assertTrue(myAutomaticBike.isStatus());
        for (int count = 1; count <= 21; count++) {
            myAutomaticBike.accelerate();
        }
        assertEquals(21, myAutomaticBike.getSpeed());
        assertEquals(2, myAutomaticBike.getGear());

        for (int count = 1; count <= 2; count++) {
            myAutomaticBike.decelerate();
        }
        assertEquals(17, myAutomaticBike.getSpeed());
        assertEquals(1, myAutomaticBike.getGear());
    }
}