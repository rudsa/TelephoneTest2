package phone;

import module.TelephoneConnector;
import module.TelephoneDisplay;
import module.TelephoneHandset;
import module.TelephoneSpeaker;

public class PhoneMain {
    public static void main(String[] args) {
        TelephoneConnector telConnector = new TelephoneConnector();
        if(telConnector.isConnectState()){
            TelephoneHandset telHandset = new TelephoneHandset();
                telHandset.randomHandset();
                Phone phone = new Phone();
            if(telHandset.isHandsetState()){
                phone.pressButton();
                if(phone.numberChecker()){
                    TelephoneDisplay telDisplay = new TelephoneDisplay();
                    telDisplay.setContents(phone.getPressNumber());
                    telDisplay.show();
                    if(phone.signal()){
                        telHandset.speak();
                        telHandset.sound();
                    }else {
                        System.out.println("I can't answer the phone, please call me again next time");
                    }
                }else{
                    System.out.println("You Entered An Incorrect Phone Number.");
                }
            }else{
                if(phone.signal()){
                    TelephoneSpeaker telSpeaker = new TelephoneSpeaker();
                    telSpeaker.sound();
                    telHandset.pickUpHandset();
                    telHandset.sound();
                    telHandset.speak();
                    telHandset.putDownHandset();
                }else{
                    System.out.println("Please Pickup Handset");
                }
            }
        }else{
            System.out.println("Please Connect Power");
        }
    }
}
