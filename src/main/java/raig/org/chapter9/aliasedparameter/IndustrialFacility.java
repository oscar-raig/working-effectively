package raig.org.chapter9.aliasedparameter;

public class IndustrialFacility  extends Facility {
  Permit basePermit;

  public IndustrialFacility(int facilityCode, String owner,
      OriginationPermit permit) throws PermitViolation {

    Permit associatedPermit =
      PermitRepository.GetInstance().findAssociatedFromOrigination(permit);

    if (associatedPermit.isValid() && !permit.isValid()) {
      basePermit = associatedPermit;
    } else if (!permit.isValid()) {
      permit.validate();
      basePermit = permit;
    } else
        throw new PermitViolation(permit);
    }
}


