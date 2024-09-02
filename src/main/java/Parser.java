public class Parser {

    public static Command parse(String input) throws TaskManagerException {
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
        } else {
            throw new TaskManagerException("Error: Unrecognized command. Please enter a valid task command.");
        }
    }
}
