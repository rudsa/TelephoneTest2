package module;

import java.util.Random;
import java.util.Scanner;

public class TelephoneHandset implements Speaker, TelephoneTransmitter{

    private boolean handsetState = false;

    public void pickUpHandset(){
        this.handsetState = true;
    }
    public void putDownHandset(){
        this.handsetState = false;
    }
    public boolean randomHandset(){
        Random random = new Random();
        return this.handsetState = random.nextBoolean();
    }

    public boolean isHandsetState() {
        return this.handsetState;
    }

    @Override
    public void sound() {
        System.out.println("Kim : Hello");
    }

    @Override
    public void transmitter(){
        if(isHandsetState()){
            System.out.println("Transmission Signal");
        }
    }

    @Override
    public void speak() {
        if(isHandsetState()){
            Scanner scan = new Scanner(System.in);
            System.out.print("Lee : ");
            scan.next();
            transmitter();
        }
    }
}
