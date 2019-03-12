package raig.org.chapter9.hiddendependency;


import org.junit.Test;

public class MailingListDispatcherShould {

  @Test
  public void sendMessageToARecipient() {
    MailingListDispatcher mailingListDispatcher = new MailingListDispatcher();
    mailingListDispatcher.sendMessage();
  }

}
