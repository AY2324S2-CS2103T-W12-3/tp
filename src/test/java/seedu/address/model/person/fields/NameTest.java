package seedu.address.model.person.fields;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Name(null));
    }

    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Name("")); // empty string
        assertThrows(IllegalArgumentException.class, () -> new Name(" ")); // spaces only
        assertThrows(IllegalArgumentException.class, () -> new Name("^")); // only non-alphanumeric characters
        assertThrows(IllegalArgumentException.class, () -> new Name("peter*")); // contains non-alphanumeric characters
    }

    @Test
    public void constructor_validName_success() {
        assertDoesNotThrow(() -> new Name("peter jack")); // alphabets only
        assertDoesNotThrow(() -> new Name("12345")); // numbers only
        assertDoesNotThrow(() -> new Name("peter the 2nd")); // alphanumeric characters
        assertDoesNotThrow(() -> new Name("Capital Tan")); // with capital letters
        assertDoesNotThrow(() -> new Name("David Roger Jackson Ray Jr 2nd")); // long names
    }

    @Test
    public void equals() {
        Name name = new Name("Valid Name");

        // same values -> returns true
        assertTrue(name.equals(new Name("Valid Name")));

        // same object -> returns true
        assertTrue(name.equals(name));

        // null -> returns false
        assertFalse(name.equals(null));

        // different types -> returns false
        assertFalse(name.equals(5.0f));

        // different values -> returns false
        assertFalse(name.equals(new Name("Other Valid Name")));
    }

}
