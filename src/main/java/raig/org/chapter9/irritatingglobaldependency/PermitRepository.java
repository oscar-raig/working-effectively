package raig.org.chapter9.irritatingglobaldependency;

public class PermitRepository {
  private static PermitRepository instance;
  public static PermitRepository getInstance() {
    if( instance == null ) {
      instance = new PermitRepository();
    }
    return instance;
  }

  public Permit findAssociatedPermit(PermitNotice notice) {
    return null;
  }
}
