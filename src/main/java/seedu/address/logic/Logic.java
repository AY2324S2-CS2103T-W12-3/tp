package seedu.address.logic;

import java.nio.file.Path;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.commons.exceptions.CommandHistoryException;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.util.exceptions.ParseException;
import seedu.address.model.person.Person;
import seedu.address.storage.exceptions.StorageException;

/**
 * API of the Logic component
 */
public interface Logic {

    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    String execute(String commandText) throws CommandException, ParseException, StorageException;

    /**
     * Gets the previous command's text.
     *
     * @return the previous command's text.
     * @throws CommandHistoryException if the message history is empty or the index is already at the start.
     */
    String getPreviousCommandText() throws CommandHistoryException;

    /**
     * Gets the next command's text.
     *
     * @return the next command's text.
     * @throws CommandHistoryException if the index is already at the end.
     */
    String getNextCommandText() throws CommandHistoryException;

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Person> getFilteredPersonList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

}
