package raig.org.chapter10.undetectablesideeffect;


import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class AccountDetailFrame extends Frame implements ActionListener, WindowListener{

  private TextField display = new TextField(10);
  private DetailFrame detailDisplay;
  private String projectionText;

  public AccountDetailFrame() {

  }

  @Override
  public void actionPerformed(ActionEvent event) {
    String source = (String) event.getActionCommand();
    if (source.equals("project activity")) {
      detailDisplay = new DetailFrame();
      detailDisplay.setDescription(getDetailText() + " " + getProjectionText());
      detailDisplay.show();
      String accountDescription = detailDisplay.getAccountSymbol();
      accountDescription += ": ";
      display.setText(accountDescription);
    }
  }

  @Override
  public void windowOpened(WindowEvent event) {

  }

  @Override
  public void windowClosing(WindowEvent event) {

  }

  @Override
  public void windowClosed(WindowEvent event) {

  }

  @Override
  public void windowIconified(WindowEvent event) {

  }

  @Override
  public void windowDeiconified(WindowEvent event) {

  }

  @Override
  public void windowActivated(WindowEvent event) {

  }

  @Override
  public void windowDeactivated(WindowEvent event) {

  }

  public String getDetailText() {
    return null;
  }

  public String getProjectionText() {
    return projectionText;
  }
}
