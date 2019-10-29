package l11;

import java.rmi.RemoteException;

public class BarsikException extends Throwable {
    @Override
    public String getMessage() {
        return "barsik " + super.getMessage();
    }
}
