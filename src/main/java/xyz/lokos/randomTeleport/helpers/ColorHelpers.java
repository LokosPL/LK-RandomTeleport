package xyz.lokos.randomTeleport.helpers;

public class ColorHelpers {

    private static final char COLOR_CHAR = '\u00A7';

    public static String color(String text) {
        return String.format("%s", text).replace('&', COLOR_CHAR);
    }
}
