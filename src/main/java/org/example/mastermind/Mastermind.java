package org.example.mastermind;

import org.example.mastermind.views.View;

public abstract class Mastermind {
    private final View view;

    public Mastermind() {
        view = createView();
    }

    protected abstract View createView();

    protected void play() {
        view.execute();
    }
}