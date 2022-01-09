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
                phone.numberChecker(pressNumber);
                System.out.println(phone.getChecker());
//                phone.pressButton();
            }else{
                System.out.println("Please Pickup Handset");
            }
        }else{
            System.out.println("Please Connect Power");
        }
    }
}
