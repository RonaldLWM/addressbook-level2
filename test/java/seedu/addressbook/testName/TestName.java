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
        assertTrue(personName.isSimilar(new Name("RONALD")));
        assertTrue(personName.isSimilar(new Name("RoNaLD")));
        assertTrue(personName.isSimilar(new Name("aldron")));
        assertTrue(personName.isSimilar(new Name("ladnor")));
        assertTrue(personName.isSimilar(new Name("Ron")));
        assertTrue(personName.isSimilar(new Name("RonaldMcD")));
    }

}
