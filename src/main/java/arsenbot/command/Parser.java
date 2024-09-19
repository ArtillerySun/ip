package arsenbot.command;

import arsenbot.task.TaskManagerException;

/**
 * The Parser class is responsible for interpreting user input and returning the corresponding command.
 * It determines which command the user wants to execute based on the input string.
 */
public class Parser {
    /**
     * Parses the user input and returns the corresponding Command object.
     *
     * @param input the user input string
     * @return the corresponding Command object based on the user input
     * @throws TaskManagerException if the input does not match any recognized command
     */
    public static Command parse(String input) throws TaskManagerException {
        assert input != null : "Input command should not be null";
        assert !input.trim().isEmpty() : "Input command should not be empty";
        if (input.startsWith("todo")) {
            return new AddCommand(input);
        } else if (input.startsWith("deadline")) {
            return new AddCommand(input);
        } else if (input.startsWith("event")) {
            return new AddCommand(input);
        } else if (input.startsWith("list")) {
            return new ListCommand();
        } else if (input.startsWith("delete")) {
            return new DeleteCommand(input);
        } else if (input.startsWith("mark")) {
            return new MarkCommand(input);
        } else if (input.startsWith("unmark")) {
            return new UnmarkCommand(input);
        } else if (input.equals("bye")) {
            return new ExitCommand();
        } else if (input.startsWith("find")) {
            return new FindCommand(input);
        } else {
            throw new TaskManagerException("Error: Unrecognized command. Please enter a valid task command.");
        }
    }
}
