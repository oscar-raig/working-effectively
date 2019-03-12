package raig.org.chapter9.irritatingparameter.nullobjectpattern;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerShould {

  private static final String A_ID = "1";
  private static final String AN_EXISITING_ID = "1";
  private static final String NON_EXISITING_ID = "2";
  private  Finder finder;

  @Before
  public void setUp() {
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(new EmployeeId(A_ID)));
    finder = new Finder(employeeList);
  }

  @Test
  public void notWorkIfEmployeeIdNotExists() {
    EmployeeManager employeeManager = new EmployeeManager(finder);
    List<EmployeeId> listEmployeeId = createEmployeeIds();
    employeeManager.printPayEmployee(listEmployeeId);
    // Returns NullPointer Exception because finder returns null
    // when id is NOT found
    // 1. Create NullEmployee Class
    // 2. Implements pay method that does anything in NullEmployee
    // 3. Make finder returns NullEmployee when is not found

  }

  @Test
  public void returnCorrectPaidNumber() {

    EmployeeManager employeeManager = new EmployeeManager(finder);

    List<EmployeeId> listEmployeeId = createEmployeeIds();
    int employeePaid  = employeeManager.countEmployeePaid(listEmployeeId);
    assertThat( employeePaid, is(1));

  }

  private List<EmployeeId> createEmployeeIds() {
    List<EmployeeId> listEmployeeId = new ArrayList<>();
    listEmployeeId.add(new EmployeeId(AN_EXISITING_ID));
    listEmployeeId.add(new EmployeeId(NON_EXISITING_ID));
    return listEmployeeId;
  }

}
