import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;


    public PhoneCompany(double minutePrice, double smsPrice, double gbPrice)
    {
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
        users = new ArrayList<User>();
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException
    {
        int code, usedMinutes, usedSMS;
        double usedMB;
        String name, lastName;
        Scanner in = new Scanner(file);
        User user;

        while(in.hasNextLine())
        {
            code = Integer.parseInt(in.nextLine());
            name = in.nextLine();
            lastName = in.nextLine();
            usedMinutes = Integer.parseInt(in.nextLine());
            usedSMS = Integer.parseInt(in.nextLine());
            usedMB = Double.parseDouble(in.nextLine());

            user = new User(code, name, lastName);
            user.setUsedMinutes(usedMinutes);
            user.setUsedSMS(usedSMS);
            user.setUsedMB(usedMB);

            users.add(user);
        }
    }

    public User findUserByCode(int code)
    {
        for(User u : users)
            if(u.getCode() == code)
                return u;

        return null;
    }

    public void computeUserCost(User user) {
        int usedMinutes = user.getUsedMinutes();
        int usedSMS = user.getUsedSMS();
        double usedMB = user.getUsedMB();
        user.setTotalCost(usedMinutes * minutePrice + usedSMS * smsPrice + usedMB * gbPrice / 1000);
    }
}
