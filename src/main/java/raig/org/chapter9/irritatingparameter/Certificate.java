package raig.org.chapter9.irritatingparameter;

public class Certificate {
  public static final int VALID = 0 ;
  public static final int INVALID = 1 ;

  private Double credit;
  private int status;

  public Certificate(Double credit) {
    this.credit = credit;
  }

  public Double getCredit() {
    return credit;
  }

  public int getStatus() {
    return status;
  }
}
