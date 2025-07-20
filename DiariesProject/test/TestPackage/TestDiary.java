package TestPackage;

import ClassPackage.Diary;
import ClassPackage.EmptyDiaryException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiary {
    Diary myDiary;

    @BeforeEach
    void setUp() {
        myDiary = new Diary("wande", "passcode");
    }
    @Test
    public void diaryIsLockedTest() {
      myDiary.lockDiary();
      assertTrue(myDiary.isLocked());
    }

    @Test
    public void diaryIsUnlockedTest() {
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("passcode");
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void diaryCanCreateEntryTest() {
        myDiary.unlockDiary("passcode");
        assertFalse(myDiary.isLocked());

        myDiary.createEntry("Alice", "body");
        assertEquals(1, myDiary.getEntries().size());
    }

    @Test
    public void diaryCanDeleteEntryTest() {
        myDiary.unlockDiary("passcode");
        assertFalse(myDiary.isLocked());

        myDiary.createEntry( "Alice", "body");
        myDiary.createEntry( "Bob", "body");
        myDiary.createEntry( "Carl", "body");
        assertEquals(3, myDiary.getEntries().size());

        myDiary.deleteEntry(3);
       assertEquals(2, myDiary.getEntries().size());
    }

    @Test
    public void diaryCanThrowExceptionTest() {
        myDiary.unlockDiary("passcode");
        assertFalse(myDiary.isLocked());

        assertThrows(EmptyDiaryException.class, () -> myDiary.deleteEntry(1));
    }

    @Test
    public void diaryCanUpdateEntryTest() {
        myDiary.unlockDiary("passcode");
        assertFalse(myDiary.isLocked());

        myDiary.createEntry("Alice", "body");
        assertEquals("Alice", myDiary.findEntryById(101).getTitle());

        myDiary.updateEntry(101,"Alice in the wonder land", " body vampires diary");
        assertEquals("Alice in the wonder land", myDiary.findEntryById(101).getTitle());

    }

    @Test
    public void diaryCanGetEntryByIdTest(){
        myDiary.unlockDiary("passcode");
        assertFalse(myDiary.isLocked());

        myDiary.createEntry("Alice", "body");
        myDiary.createEntry("Bob", "body");

        assertEquals(1,myDiary.findEntryById(1));
    }
}