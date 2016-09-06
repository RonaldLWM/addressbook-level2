package seedu.addressbook.commands;

import java.util.ArrayList;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.tag.Tagging;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Exits the program.\n"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_EXIT_ACKNOWEDGEMENT = "Exiting Address Book as requested ...";

    @Override
    public CommandResult execute() {
    	listAllTaggings(addressBook.getAllTaggings());
        return new CommandResult(MESSAGE_EXIT_ACKNOWEDGEMENT);
    }
    
    public void listAllTaggings(ArrayList<Tagging> allTaggings) {
    	for(Tagging tagging : allTaggings) { 
    		System.out.println(tagging.getPrintableString());
    	}
    }

    public static boolean isExit(Command command) {
        return command instanceof ExitCommand; // instanceof returns false if it is null
    }
}
