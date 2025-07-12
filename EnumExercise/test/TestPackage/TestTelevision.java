package TestPackage;

import ClassPackage.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTelevision {
    @Test
    public void televisionIsOnTest() {
        Television myTelevision = new Television();
        myTelevision.toggle();
        assertTrue(myTelevision.isOn());
    }
}
