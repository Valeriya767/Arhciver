package ru.valeriyakholina.archiver.command;


import ru.valeriyakholina.archiver.ConsoleHelper;
import ru.valeriyakholina.archiver.ZipFileManager;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Удаление файла из архива.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введите полный путь файла в архиве:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.removeFile(sourcePath);

            ConsoleHelper.writeMessage("Удаление из архива завершено.");
        }catch (FileNotFoundException e){
            ConsoleHelper.writeMessage("Неверный путь для распаковки.");
        }

    }
}