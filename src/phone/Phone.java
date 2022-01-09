package phone;

import action.TelephoneButtonPress;
import action.TelephoneNumberChecker;
import module.TelephoneButtons;

public class Phone {

    private String pressNumber = "";

    public boolean numberChecker(){
        TelephoneNumberChecker telNumChecker = new TelephoneNumberChecker();
        return telNumChecker.telAreaNumberChecker(this.pressNumber);
    }

    public void pressButton(String pressNumber){
        TelephoneButtonPress telButtonPress = new TelephoneButtonPress();
        this.pressNumber = telButtonPress.pressButton(pressNumber);
    }
}
