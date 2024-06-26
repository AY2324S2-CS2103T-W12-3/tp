package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.AddressBook;
import seedu.address.model.Model;

/**
 * Clears AssetBook.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "AssetBook has been cleared!";

    @Override
    public String execute(Model model) {
        requireNonNull(model);
        model.setAddressBook(new AddressBook());
        return MESSAGE_SUCCESS;
    }

}
