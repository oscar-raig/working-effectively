package raig.org.chapter9.irritatingparameter.nullobjectpattern;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class EmployeeIdShould {

  @Test
  public void equalsShouldReturnsTrueIfIdsAreTheSame() {
    EmployeeId employeeId1 = new EmployeeId("1");
    EmployeeId employeeId2 = new EmployeeId("1");

    assertThat(employeeId1.equals(employeeId2), is(true));
  }


  @Test
  public void equalsShouldReturnsFalseIfIdsAreTheDifferent() {
    EmployeeId employeeId1 = new EmployeeId("1");
    EmployeeId employeeIdWithDifferentId = new EmployeeId("2");

    assertThat(employeeId1.equals(employeeIdWithDifferentId), is(false));
  }

}
