package raig.org.chapter9.aliasedparameter;

public class PermitRepository {
  private static PermitRepository instance;
  public static PermitRepository GetInstance() {
      if(instance == null) {
        instance =  new PermitRepository();
      }
    return instance;
  }

  public Permit findAssociatedFromOrigination(OriginationPermit permit) {
    return null;
  }
}
