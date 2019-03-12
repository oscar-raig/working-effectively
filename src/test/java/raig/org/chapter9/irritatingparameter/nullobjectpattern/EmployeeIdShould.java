package raig.org.chapter9.irritatingparameter.nullobjectpattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;



import org.junit.jupiter.api.Test;

public class EmployeeIdShould {

  @Test
  public void equalsShouldReturnsTrueIfIdsAreTheSame() {
    EmployeeId employeeId1 = new EmployeeId("1");
    EmployeeId employeeId2 = new EmployeeId("1");

    assertThat(employeeId1.equals(employeeId2)).isTrue();
  }


  @Test
  public void equalsShouldReturnsFalseIfIdsAreTheDifferent() {
    EmployeeId employeeId1 = new EmployeeId("1");
    EmployeeId employeeIdWithDifferentId = new EmployeeId("2");

    assertThat(employeeId1.equals(employeeIdWithDifferentId)).isFalse();
  }

}
