package seedu.address.logic;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.address.model.person.Person;
import seedu.address.model.person.fields.Prefix;

/**
 * Container for user visible messages.
 */
public class Messages {

    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_PERSON_DISPLAYED_INDEX = "The person index provided is invalid";
    public static final String MESSAGE_PERSONS_LISTED_OVERVIEW = "%1$d persons listed!";
    public static final String MESSAGE_DUPLICATE_FIELDS =
                "Multiple values specified for the following single-valued field(s): ";

    public static final String MESSAGE_SHOWING_HELP = "Opened help window.";
    public static final String MESSAGE_EXITING = "Exiting AssetBook as requested ...";
    public static final String MESSAGE_COPIED = "Copied details to clipboard: %1$s";
    public static final int MESSAGE_COPIED_LEN = "Copied details to clipboard:".length();

    /**
     * Returns an error message indicating the duplicate prefixes.
     */
    public static String getErrorMessageForDuplicatePrefixes(Prefix... duplicatePrefixes) {
        assert duplicatePrefixes.length > 0;

        Set<String> duplicateFields =
                Stream.of(duplicatePrefixes).map(Prefix::toString).collect(Collectors.toSet());

        return MESSAGE_DUPLICATE_FIELDS + String.join(" ", duplicateFields);
    }

    /**
     * Formats the {@code person} for display to the user.
     */
    public static String format(Person person) {
        final StringBuilder builder = new StringBuilder();
        builder.append(person.getName())
                .append("; Phone: ")
                .append(person.getPhone())
                .append("; Email: ")
                .append(person.getEmail())
                .append("; Address: ")
                .append(person.getAddress())
                .append("; Tags: ")
                .append(person.getTags())
                .append("; Assets: ")
                .append(person.getAssets());
        return builder.toString();
    }

}
