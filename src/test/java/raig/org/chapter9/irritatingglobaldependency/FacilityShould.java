package raig.org.chapter9.irritatingglobaldependency;


import org.junit.Test;

public class FacilityShould {

  @Test
  public void testCreate() throws PermitViolation {
    PermitNotice notice = new PermitNotice(0, "a");
    Facility facility = new Facility(Facility.RESIDENCE, "b", notice);
  }
}
