package module;

public class TelephoneHandset implements TelephoneReceiver, TelephoneTransmitter{

    private boolean receiveState = false;
    private boolean handsetState = false;

    public void pickUpHandset(){
        this.handsetState = true;
    }
    public void putDownHandset(){
        this.handsetState = false;
    }

    public boolean isHandsetState() {
        return this.handsetState;
    }

    @Override
    public void receive(){

    }

    @Override
    public void transmitter(){
        if(isHandsetState()){

        }
    }

    @Override
    public void sound() {
        if(isHandsetState()){

        }
    }

}
