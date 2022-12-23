package xyz.lokos.randomTeleport.helpers;

import java.util.logging.Level;

public class LoggerHelpers {

    public static void success(String message) {
        System.out.print("(Komunikat: " + DataHelpers.getAll() + " { udalo sie! }, poniewaz: " + message + ")" + "\n");
    }

    public static void error(String message) {
        System.out.print("(Komunikat: " + DataHelpers.getAll() + " { nie udalo sie! }, poniewaz: " + message + ")" + "\n");
    }

    public static void load(String message) {
        System.out.print("(Komunikat: " + DataHelpers.getAll() + " { laduje sie! }, poniewaz: " + message + ")" + "\n");
    }

    public static void info(Level info, String message) {
        System.out.print("(Komunikat: " + DataHelpers.getAll() + " { informacja! }, poniewaz: " + message + ")" + "\n");
    }
}
