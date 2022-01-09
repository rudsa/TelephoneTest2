package module;

import java.util.Random;

public class TelephoneConnector implements Connector{

    private boolean connectState = true;

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
