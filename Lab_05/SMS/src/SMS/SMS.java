package SMS;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class SMS {
    private final String sender;
    private final GregorianCalendar date;
    private final int id;
    private static int totalNumberSMS;
    private final String text;

    public SMS(String sender, GregorianCalendar date, String text) {
        this.sender = sender;
        this.date = date;
        this.text = text;
        this.id = totalNumberSMS;
        totalNumberSMS++;
    }

    public String getSender() {
        return sender;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public static int getTotalNumberSMS() {
        return totalNumberSMS;
    }

    public String getText() {
        return text;
    }

    public static Comparator<SMS> dateComparator = new Comparator<SMS>() {
        @Override
        public int compare(SMS a, SMS b) {
            return a.getDate().compareTo(b.getDate());
        }
    };

    public static Comparator<SMS> senderComparator = new Comparator<SMS>() {
        @Override
        public int compare(SMS a, SMS b) {
            return a.getSender().compareTo(b.getSender());
        }
    };

}