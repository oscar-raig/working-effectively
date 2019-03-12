package raig.org.chapter9.irritatingparameter;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CreditValidatorShould {

  private static double THRESHOLD = 100.0;

  @Test
  public void testCreate() {
//    CreditValidator validator = new CreditValidator();

  }

  @Test
  public void testNoSuccesss() throws InvalidCredit {
    CreditMaster creditMaster = new CreditMaster("crm2.mas", true);
    RghConnection rghConnection = new RghConnection(112,"a name","a password");
    CreditValidator creditValidator = new CreditValidator(rghConnection, creditMaster, "a");

    rghConnection.report = new RfdiReport();
    Certificate  certificate = creditValidator.validateCustomer(new Customer());

    assertEquals(Certificate.VALID, certificate.getStatus());

  }

  @Test
  public void testAllPassed100Percent() throws Exception, InvalidCredit {

    CreditMaster master = new CreditMaster("crm2.mas", true);
    RghConnection connection = new RghConnection(123, "admin", "rii8ii9s");
    CreditValidator validator = new CreditValidator(connection, master, "a");

    connection.report = new RfdiReport();
    Certificate result = validator.validateCustomer(new Customer());
    assertEquals(100.0, validator.getValidationPercent(), THRESHOLD);
  }

}
