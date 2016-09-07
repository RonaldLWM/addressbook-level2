package common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import seedu.addressbook.common.Utils;

public class UtilsTest {

    @Test
    public void testIsAnyNull() {

        boolean expected = Utils.isAnyNull("hi", "hello", "how are you");
        boolean actual = Utils.isAnyNull("hi", "hello", "how are you?", null);

        assertFalse(expected == actual);
    }

    @Test
    public void testElementsAreUnique() {

        ArrayList<String> items = new ArrayList<String>();

        items.add("a");
        items.add("b");
        items.add("c");

        ArrayList<String> alphabets = new ArrayList<String>();

        alphabets.add("a");
        alphabets.add("a");
        alphabets.add("b");

        boolean expected = Utils.elementsAreUnique(items);
        boolean actual = Utils.elementsAreUnique(alphabets);

        assertFalse(expected == actual);
    }
}
