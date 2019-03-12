package raig.org.chapter9.constructionblob;

public class WatercolorPane {

  private Panel anteriorPanel;
  private Panel backgroundPanel;
  private FocusWidget cursor;

  public WatercolorPane(Form border, WashBrush brush, Pattern backdrop) {


    anteriorPanel = new Panel(border, backdrop);

    anteriorPanel.setBorderColor(brush.getForeColor());
    backgroundPanel = new Panel(border, backdrop);

    cursor = new FocusWidget(brush, backgroundPanel);

  }
}
