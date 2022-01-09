package phone;

import action.TelephoneButtonPress;
import action.TelephoneNumberChecker;
import module.TelephoneButtons;

public class Phone {

    private String number;
    private boolean checker = false;

    public void numberChecker(String number){
        this.number = number;
        TelephoneNumberChecker telNumChecker = new TelephoneNumberChecker();
        telNumChecker.setTelNumber(this.number);
        this.checker = telNumChecker.telAreaNumberChecker();
    }

    public void pressButton(){
        TelephoneButtonPress telButtonPress = new TelephoneButtonPress();
        if(this.checker){

        }else{

        }
    }

    public boolean getChecker(){
        return this.checker;
    }
}
