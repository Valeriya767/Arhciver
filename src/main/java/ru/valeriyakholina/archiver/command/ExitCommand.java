package ru.valeriyakholina.archiver.command;

import ru.valeriyakholina.archiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
