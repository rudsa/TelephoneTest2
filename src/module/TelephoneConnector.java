package module;

public class TelephoneConnector implements Connector{

    private boolean connectState = false;

    @Override
    public void connect() {
         this.connectState = true;
    }

    @Override
    public void disconnect() {
         this.connectState = false;
    }

    public boolean isConnectState() {
        return this.connectState;
    }
}
