package raig.org.chapter9.hiddendependency;

public class MailingListDispatcher {

  private static final int MAIL_OKAY = 1;
  private Service service;
  private int status;


  public MailingListDispatcher() {
    service = new Service();
    status = MAIL_OKAY;
  }

  public void sendMessage() {

  }

}
