package raig.org.chapter10.undetectablesideeffect;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import static com.sun.tools.javac.tree.JCTree.Tag.SL;
import static javafx.application.ConditionalFeature.MEDIA;

public class AccountDetailFrame extends Frame  implements ActionListener, WindowListener{

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
  public void windowOpened(WindowEvent e) {

  }

  @Override
  public void windowClosing(WindowEvent e) {

  }

  @Override
  public void windowClosed(WindowEvent e) {

  }

  @Override
  public void windowIconified(WindowEvent e) {

  }

  @Override
  public void windowDeiconified(WindowEvent e) {

  }

  @Override
  public void windowActivated(WindowEvent e) {

  }

  @Override
  public void windowDeactivated(WindowEvent e) {

  }

  public String getDetailText() {
    return null;
  }

  public String getProjectionText() {
    return projectionText;
  }
}
