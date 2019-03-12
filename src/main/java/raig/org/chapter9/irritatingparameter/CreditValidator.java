package raig.org.chapter9.irritatingparameter;


public class CreditValidator {

  private CreditMaster creditMaster;
  private double validationPercent;

  public CreditValidator(RghConnection connection ,
                         CreditMaster creditMaster,
                         String validatorId) {

    this.creditMaster = creditMaster;
  }

  Certificate validateCustomer(Customer customer) throws InvalidCredit {
    Double customerCredit = this.creditMaster.getCustomerCredit(customer);

    return new Certificate(customerCredit);
  }

  public double getValidationPercent() {
    return validationPercent;
  }
}
