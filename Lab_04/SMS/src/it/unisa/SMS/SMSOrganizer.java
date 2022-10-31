package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    private List<SMS> messages;

    public SMSOrganizer()
    {
        messages = new ArrayList<SMS>();
    }

    public void addSMSToOrganizer(SMS sms)
    {
        messages.add(sms);
    }

    public List<SMS> getListByDate()
    {
        messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS a, SMS b) {
                return a.getDate().compareTo(b.getDate());
            }
        });
        return messages;
    }

    public List<SMS> getListBySender()
    {
        messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS a, SMS b) {
                return a.getSender().compareTo(b.getSender());
            }
        });

        return messages;
    }
}
