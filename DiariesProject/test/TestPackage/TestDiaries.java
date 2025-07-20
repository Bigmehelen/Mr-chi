package TestPackage;

import ClassPackage.Diaries;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiaries {
    Diaries myDiaries;

    @BeforeEach
    void setUp() {
        myDiaries = new Diaries("john doe", "blue22");
    }

    @Test
    public void diariesCanAddTest() {
        myDiaries.add("john doe", "blue22");
        assertEquals(1, myDiaries.getDiaries().size());
    }

    @Test
    public void diariesCanFindByUserNameTest() {
        myDiaries.add("john doe", "blue22");
        myDiaries.add("wande helen", "sky22");

        assertEquals("wande helen", myDiaries.findByUserName("wande helen").getUserName());
    }

    @Test
    public void diariesCanDeleteTest() {
        myDiaries.add("john doe", "blue22");
        myDiaries.add("wande helen", "sky22");

        myDiaries.delete("john doe", "blue22");
        assertEquals(1, myDiaries.getDiaries().size());
    }
}