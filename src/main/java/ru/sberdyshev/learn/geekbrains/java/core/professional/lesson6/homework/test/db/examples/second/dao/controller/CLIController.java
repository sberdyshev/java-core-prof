package ru.sberdyshev.learn.geekbrains.java.core.professional.lesson6.homework.test.db.examples.second.dao.controller;

import ru.sberdyshev.learn.geekbrains.java.core.professional.lesson6.homework.test.db.examples.second.dao.controller.command.Command;

/**
 * @author sberdyshev
 */
public interface CLIController extends Controller {
    public Command parse(String line);
}
