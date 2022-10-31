package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
    private final String sender;
    private final GregorianCalendar date;
    private static int totalids = 0;
    private final int id;
    private final String text;

    public SMS(String sender, GregorianCalendar date, String text)
    {
        this.sender = sender;
        this.date = date;
        this.text = text;
        id = totalids;
        totalids++;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public String getSender() {
        return sender;
    }
}