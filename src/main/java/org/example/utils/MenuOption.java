package org.example.utils;

public abstract class MenuOption {

    protected final String title;

    public MenuOption(String title) {
        this.title = title;
    }

    public abstract void execute();

    public String getTitle() {
        return title;
    }
}
