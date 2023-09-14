package org.example.mastermind.types;

public enum Error {
    REPEATED, COLOR, LENGTH, NULL;

    public boolean exists() {
        return !this.equals(NULL);
    }
}