package TestStackPackage;

import StackPackage.Stacks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    Stacks myStacks;
    @BeforeEach
    public void setUp(){
        myStacks = new Stacks(4);
    }

    @Test
    public void stacksIsEmptyTest() {
        myStacks.isEmpty();
        assertTrue(myStacks.isEmpty());
    }

    @Test
    public void stacksIsNotEmptyTest() {
        myStacks.isEmpty();
        assertTrue(myStacks.isEmpty());

        myStacks.pushElement("eating");
        assertFalse(myStacks.isEmpty());
    }

    @Test
    public void stacksCanRemoveElementTest() {
        myStacks.pushElement("eating");
        myStacks.pushElement("dancing");
        myStacks.isEmpty();
        assertFalse(myStacks.isEmpty());

        myStacks.popElement();
        assertEquals("dancing", myStacks.popElement());
    }

    @Test
    public void stacksCannotPopFromEmptyListTest() {
        myStacks.isEmpty();
        assertTrue(myStacks.isEmpty());

        assertThrows(IllegalStateException.class, () -> myStacks.popElement());
    }

}