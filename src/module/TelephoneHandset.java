package module;

public class TelephoneHandset {

    private boolean handsetState = false;

    public void pickUpHandset(){
        this.handsetState = true;
    }
    public void putDownHandset(){
        this.handsetState = false;
    }
}
