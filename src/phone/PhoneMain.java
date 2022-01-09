package phone;

import module.TelephoneConnector;
import module.TelephoneDisplay;
import module.TelephoneHandset;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        TelephoneConnector telConnector = new TelephoneConnector();
        if(telConnector.isConnectState()){
            TelephoneHandset telHandset = new TelephoneHandset();
            telHandset.pickUpHandset();
            if(telHandset.isHandsetState()){
                Scanner scan = new Scanner(System.in);
                String pressNumber = scan.next();
                Phone phone = new Phone();
                phone.pressButton(pressNumber);
                if(phone.numberChecker()){
                    TelephoneDisplay telDisplay = new TelephoneDisplay();
                    telDisplay.setContents(phone.getPressNumber());
                    telDisplay.show();
                }else{
                    System.out.println("You Entered An Incorrect Phone Number.");
                }
            }else{
                System.out.println("Please Pickup Handset");
            }
        }else{
            System.out.println("Please Connect Power");
        }
    }
}
