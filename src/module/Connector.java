package module;

public class Connector {
    private boolean power = false;

    public void connect(){
        this.power = true;
    }

    public void disconnect(){
        this.power = false;
    }

    public boolean getPower(){
        return this.power;
    }
}
