package phone;

import action.TelephoneButtonPress;
import action.TelephoneNumberChecker;
import module.Receiver;

import java.util.Random;
import java.util.Scanner;

public class Phone implements Receiver{

    private String pressNumber = "";


    @Override
    public boolean signal() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean numberChecker(){
        TelephoneNumberChecker telNumChecker = new TelephoneNumberChecker();
        return telNumChecker.telAreaNumberChecker(this.pressNumber);
    }

    public void pressButton(){
        TelephoneButtonPress telButtonPress = new TelephoneButtonPress();
        Scanner scan = new Scanner(System.in);
        System.out.print("Press Number : ");
        this.pressNumber = telButtonPress.pressButton(scan.next());
    }

    public String getPressNumber() {
        return this.pressNumber;
    }
}
