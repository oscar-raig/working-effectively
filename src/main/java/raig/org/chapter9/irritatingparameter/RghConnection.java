package raig.org.chapter9.irritatingparameter;

import java.io.IOException;

public class RghConnection {

  public RfdiReport report;

  public RghConnection(int port, String name, String password) {
    /// we simulate a non posible connection
    throw new UnsupportedOperationException();
  }

  public void connect() {

  }

  public void disconnect() {

  }
}
