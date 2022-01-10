package phone;

import action.TelephoneButtonPress;
import action.TelephoneNumberChecker;
import module.Receiver;
import module.TelephoneButtons;
import module.TelephoneSpeaker;

import java.util.Random;

public class Phone implements Receiver {

    private String pressNumber = "";


    @Override
    public boolean signal() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void receive() {
        TelephoneSpeaker telSpeaker = new TelephoneSpeaker();
        telSpeaker.sound();
    }

    public boolean numberChecker(){
        TelephoneNumberChecker telNumChecker = new TelephoneNumberChecker();
        return telNumChecker.telAreaNumberChecker(this.pressNumber);
    }

    public void pressButton(String pressNumber){
        TelephoneButtonPress telButtonPress = new TelephoneButtonPress();
        this.pressNumber = telButtonPress.pressButton(pressNumber);
    }

    public String getPressNumber() {
        return this.pressNumber;
    }
}
