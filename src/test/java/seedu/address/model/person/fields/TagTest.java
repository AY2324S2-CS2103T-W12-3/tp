package seedu.address.model.person.fields;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TagTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Tag(null));
    }

    @Test
    public void constructor_invalidTagName_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Tag("")); // empty string
        assertThrows(IllegalArgumentException.class, () -> new Tag("Hello@World")); // not alphanumeric
        assertThrows(IllegalArgumentException.class, () -> new Tag("Testing 123")); // contains space
        assertThrows(IllegalArgumentException.class, () -> new Tag("Café123")); // contains illegal unicode character
        assertThrows(IllegalArgumentException.class, () -> new Tag("Kaboom\\")); // contains '\'
    }

    @Test
    public void constructor_validTagName_success() {
        assertDoesNotThrow(() -> new Tag("a"));
        assertDoesNotThrow(() -> new Tag("abc"));
        assertDoesNotThrow(() -> new Tag("validTag"));
        assertDoesNotThrow(() -> new Tag("ValidTag"));
        assertDoesNotThrow(() -> new Tag("VALIDTAG"));
    }

    @Test
    public void equals() {
        Tag tag = new Tag("tag1");
        assertTrue(tag.equals(tag));
        assertEquals(tag.hashCode(), tag.hashCode());
        assertFalse(tag.equals(null));

        Tag otherTag = new Tag("tag2");
        assertFalse(tag.equals(otherTag));
    }

}
