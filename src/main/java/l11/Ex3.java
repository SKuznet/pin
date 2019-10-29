package l11;

import java.rmi.RemoteException;

public class Ex3 {
    public static void main(String[] args) {

    }

    private static void remote() throws RemoteException {
        try {
            throw new RemoteException("this is RemoteException!");
        } catch (Exception e) {
            throw e;
        }
    }
}
