package raig.org.chapter9.irritatingglobaldependency;

public class Permit {
  private boolean valid;

  public Permit(PermitNotice notice) {
    this.valid = notice.isValid();
  }

  public boolean isValid() {
    return valid;
  }

  public void validate() {

  }
}
