package TestNewPackage;

import ListPackage.NewList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNewList {
    NewList myList;
    @BeforeEach
    public void setUp(){
        myList = new NewList(3);
    }
    @Test
    public void myNewListIsEmptyTest() {
        myList.isEmpty();
        assertTrue(myList.isEmpty());
    }

    @Test
    public void myNewListIsNotEmptyTest() {
        myList.isEmpty();
        assertTrue(myList.isEmpty());

        myList.add("five");
        assertFalse(myList.isEmpty());
    }

    @Test
    public void myNewListCanDeleteTest() {
        myList.add("five");
        myList.add("sleep");
        myList.add("eat");
       assertFalse(myList.isEmpty());

       myList.remove("sleep");
       assertEquals(2, myList.size());

    }
    @Test
    public  void myNewListCanRemoveMoreThanOneItemTest() {
        myList.add("five");
        myList.add("sleep");
        myList.add("eat");
        assertFalse(myList.isEmpty());

        myList.remove("five");
        myList.remove("sleep");
        myList.remove("eat");
        assertEquals(0, myList.size());
    }

}
