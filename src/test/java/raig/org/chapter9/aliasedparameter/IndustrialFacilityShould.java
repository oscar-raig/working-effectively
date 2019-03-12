package raig.org.chapter9.aliasedparameter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class IndustrialFacilityShould {

  @Test
  public void testHasPermits() throws PermitViolation {
    Facility facility = new IndustrialFacility(111,"owner", new OriginationPermit());
    assertTrue(facility.hasPermits());
  }
}
