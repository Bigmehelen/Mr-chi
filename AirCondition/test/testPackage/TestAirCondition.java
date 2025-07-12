package testPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAirCondition {
    @Test
    public void testAirConditionCanTurnOnTest() {
        AirCondition myAirCondition = new AirCondition();
        assertEquals(false, myAirCondition.checkStatus());
        boolean isStatus = true;
        myAirCondition.onAirCondition();
        assertEquals(true, myAirCondition.checkStatus());
    }

    @Test
    public void airConditionCanTurnOffTest() {
        AirCondition myAirCondition = new AirCondition();
        myAirCondition.onAirCondition();
        assertEquals(true, myAirCondition.checkStatus());
        myAirCondition.offAirCondition();
        assertEquals(false, myAirCondition.checkStatus());
    }

    @Test
    public void increaseTemperatureTest() {
        AirCondition myAirCondition = new AirCondition();
        myAirCondition.onAirCondition();
        assertEquals(true, myAirCondition.checkStatus());
        myAirCondition.increaseTemperature(2);
        assertEquals(18, myAirCondition.checkTemperature());
    }

    @Test
    public void decreaseTemperatureTest() {
        AirCondition myAirCondition = new AirCondition();
        myAirCondition.onAirCondition();
        assertEquals(true, myAirCondition.checkStatus());
        myAirCondition.decreaseTemperature(2);
        assertEquals(16, myAirCondition.checkTemperature());
    }

    @Test
    public void temperatureCannotIncreaseBeyond30Test() {
        AirCondition myAirCondition = new AirCondition();
        myAirCondition.onAirCondition();
        assertEquals(true, myAirCondition.checkStatus());
        myAirCondition.increaseTemperature(12);
        assertEquals(28, myAirCondition.checkTemperature());
    }

    @Test
    public void temperatureCannotDecreaseBeyond16Test() {
        AirCondition myAirCondition = new AirCondition();
        myAirCondition.onAirCondition();
        assertEquals(true, myAirCondition.checkStatus());
        myAirCondition.decreaseTemperature(2);
        assertEquals(16, myAirCondition.checkTemperature());
    }
}