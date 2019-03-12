package raig.org.chapter9.irritatingglobaldependency;

public class Facility {
  public static final int RESIDENCE = 1;
  private Permit basePermit;

  public Facility(int facilityCode, String owner, PermitNotice notice) throws PermitViolation {
    Permit associatedPermit =
    PermitRepository.getInstance().findAssociatedPermit(notice);

    if (associatedPermit.isValid() && !notice.isValid()) {
      basePermit = associatedPermit;
    } else if (!notice.isValid()) {
      Permit permit = new Permit(notice);
      permit.validate();
      basePermit = permit;
    } else
      throw new PermitViolation(notice); // Book Mistake? notice was permit before
  }

}

