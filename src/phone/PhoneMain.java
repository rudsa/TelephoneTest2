package phone;

import module.TelephoneConnector;
import module.TelephoneDisplay;
import module.TelephoneHandset;

public class PhoneMain {
    public static void main(String[] args) {
        TelephoneConnector telConnector = new TelephoneConnector();
        telConnector.connect();
        if(telConnector.isConnectState()){
            TelephoneHandset telHandset = new TelephoneHandset();
            telHandset.pickUpHandset();
        }else{
            System.out.println("Please Connect Power");
        }
    }
}
