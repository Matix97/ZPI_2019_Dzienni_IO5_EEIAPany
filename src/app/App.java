package app;

import app.console.Console;

public class App {
    Console console;

    public App() {
        console = new Console();
    }

    public void run() {
        console.run();
    }
}
