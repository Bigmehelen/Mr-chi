package TestPackage;

import ClassPackage.Diaries;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiaries {
    Diaries myDiaries;

    @BeforeEach
    void setUp() {
        myDiaries = new Diaries("wande", "passcode");
    }
    @Test
    public void diariesIsLockedTest() {
      myDiaries.lockDiary();
      assertTrue(myDiaries.isLocked());
    }

    @Test
    public void diariesIsUnlockedTest() {
        myDiaries.lockDiary();
        assertTrue(myDiaries.isLocked());
        myDiaries.unlockDiary("passcode");
        assertFalse(myDiaries.isLocked());
    }

    @Test
    public void diariesCanCreateEntryTest() {
        myDiaries.unlockDiary("passcode");
        assertFalse(myDiaries.isLocked());

        myDiaries.createEntry(1, "Alice", "body");
        assertEquals(1, myDiaries.findEntry(1));
    }

}