package seedu.addressbook.testName;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class TestName {

    @Test
    public void testIsSimilar() throws IllegalValueException {
        Name personName = new Name("Ronald");
        assertTrue(personName.isSimilar(null));
        assertTrue(personName.isSimilar("RONALD"));
        assertTrue(personName.isSimilar("RoNaLD"));
        assertTrue(personName.isSimilar("aldron"));
        assertTrue(personName.isSimilar("ladnor"));
        assertTrue(personName.isSimilar("Ron");
        assertTrue(personName.isSimilar("RonaldMcD"));
    }

}
