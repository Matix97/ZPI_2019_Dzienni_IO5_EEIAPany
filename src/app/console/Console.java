package app.console;

import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public void run() {

    }

    private void askForOutputType() {
        System.out.println("Podaj typ danych:\n" +
                "1. Sesje wzrostowe, spadkowe i bez zmian.\n" +
                "2. Miary statyczne" +
                "3. Rozkad zmian miesięcznych");

        int x = scanner.nextInt();
        switch (x){
            default:

                break;
        }
    }
}
