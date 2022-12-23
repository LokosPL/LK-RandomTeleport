package xyz.lokos.randomTeleport.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHelpers {

    public static String getData() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }

    public static String getGodzina() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    public static String getAll() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
