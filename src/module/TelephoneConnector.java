package module;

public class TelephoneConnector implements Connector{

    private boolean power = false;

    @Override
    public void connect() {
        this.power = true;
    }

    @Override
    public void disconnect() {
        this.power = false;
    }
}
