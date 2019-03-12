package raig.org.chapter9.aliasedparameter;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndustrialFacilityShould {

  @Test
  public void testHasPermits() throws PermitViolation {
    Facility facility = new IndustrialFacility(111,"owner", new OriginationPermit());
    assertTrue(facility.hasPermits());
 }

}
