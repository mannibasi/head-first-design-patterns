package com.design.patterns.command.undo;

public interface Command {
    void execute();

    void undo();
}
